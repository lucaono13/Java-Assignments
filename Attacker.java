public class Attacker extends Player{
    private int GoalsScored, GoalsMissed, TotalPoints;

    public Attacker(String name, int age, int scored, int missed)
    {
        //Super passed the name and age to the Player class creating the object with the name and age, then sets the remaining class variables
        super(name, age);
        GoalsScored = scored;
        GoalsMissed = missed;
        setTotalPoints((GoalsScored * 3) - GoalsMissed);
    }

    public void printInfo()
    {
        //This runs the Player class .printInfo() method to print the first two lines
        super.printInfo();
        System.out.println("Type: Attacker");
        System.out.println("Goals Scored: " + GoalsScored);
        System.out.println("Goals Missed: " + GoalsMissed);
        System.out.println("Total Points: " + getTotalPoints());

    }



}
