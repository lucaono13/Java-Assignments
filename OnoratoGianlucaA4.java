import static  java.lang.System.*;

public class OnoratoGianlucaA4 {
    //Create two private variables. The first for the account balance and the second for the member name
    private static double balance;
    private static String member;

    //Constructor for Class
    //Sets the inputs to balance and member private variables and prints out the Account name and Balance
    public OnoratoGianlucaA4(String name, double bal){
        balance = bal;
        member = name;
        out.println("Account Name: " + member);
        out.println("Account Balance: $" + balance + "\n");
    }

    //Deposit Method
    //Takes in an amount to be deposited, and if the number is not zero and positive, then it will add that amount to the current balance and then print out the Deposit amount and the new balance
    //If the amount is equal to 0 or is negative, then an error message appears telling user to change the value to fulfill the requirements
    public void deposit(double amt_d){
        if (amt_d > 0){
            balance += amt_d;
            out.println("Deposit Amount: $" + amt_d);
            out.println("Account Balance: $" + balance + "\n");
        }
        else if (amt_d < 0)
            out.println("Can't deposit a negative number!\nPlease change value to a positive number.\n");
        else
            out.println("Can't deposit nothing!\nPlease change value to a positive number.");
    }

    //Withdrawal Method
    //Checks to see if the amount to be withdrawn is less than the balance of the account minus 10 to make sure that there is a minimum of $10 in the account
    //If the new balance is above 10, then subtract the amount withdrawn from the balance and print out the withdrawal amount and the new balance
    public void withdraw(double amt_w){
        if (amt_w > 0) {
            if ((balance - amt_w) > 10) {
                balance -= amt_w;
                out.println("Withdrawal Amount: $" + amt_w);
                out.println("Account Balance: $" + balance + "\n");
            } else
                out.println("Can't withdraw. New balance is below $10!\nMake sure that you keep $10 minimum in your account.\n");
        }
        else if (amt_w < 0)
            out.println("Can't withdraw a negative amount!\nPlease change value to a positive number.\n");
        else
            out.println("Can't withdraw nothing!\nPlease change value to a positive number.\n");
    }

    //Print Account Method
    //Method to describe the amount in terms of account name and account balance
    public void printAcc(){
        out.println("Account Name: " + member);
        out.println("Account Balance: $" + balance + "\n");
    }

    public static void main(String args[]){

        OnoratoGianlucaA4 acc1 = new OnoratoGianlucaA4("Jerry", 30);
        acc1.deposit(500);
        acc1.withdraw(70);
        acc1.printAcc();

        out.println("Program Completed");
    }
}


/*
Sources:
https://www.tutorialspoint.com/java/java_variable_types.htm
 */