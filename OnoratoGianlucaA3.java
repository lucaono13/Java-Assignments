import static java.lang.System.*;

public class OnoratoGianlucaA3 {
    public static void main (String[] args){
        //Creates the three necessary string variables
        String string1 = "Santa Clara";
        String string2 = "University";
        String string3 = "Never buy a piece of art that you don't have to have. You know, don't worry about who the artist is or how much it's worth. I mean, you have to live with it everyday. You have to walk by it everyday. You have to really love it. You have to really appreciate it.";

        //Prints the result of the booloean if the first string starts with the word 'Santa"
        out.println("Is first word in string 1 Santa? : " + string1.startsWith("Santa"));

        //Creates a new string variable where the combination of strings 1 and 2 are stored
        String new_string = string1 + " " + string2;
        out.println("New String: " + new_string);

        //Splits the new_string variable into an array for easier counting
        String[] words = new_string.split("\\s+");
        //Prints the length of the array which is the number of words in the string variable
        out.println("Total number of words in the new string are: " + words.length);

        //Splits string3 into an array (each word being a new index)
        String[] have = string3.split("\\s+");
        //For loop that checks each word (see: index) in the array and checks if it is equal to "have"
        int count = 0;
        for (int x = 0; x < have.length; x++){
            if (have[x].equals("have")){
                //Adds one to the count variable
                count = count + 1;
            }
        }
        //Prints out the count variable which is how many "have"s there are in the string
        out.println("Occurrences of have in string 3: " + count);

        //Creates another array for the creation of the reverse of the last line
        String[] rev_word = string3.split("\\s+");
        //String variable for the new reverse line to be stored in
        String rev = "";
        //For loop that goes backwards in the array and grabs the word and places in into the string
        for (int i = rev_word.length - 1; i >= 0; i--){
            //Makes sure that each word is separated by a space
            rev += rev_word[i] + " ";
        }
        //Creates a substring to only get the first 34 characters of the string, which is the last line of the original string
        String reverse = rev.substring(0, 33);

        //Prints out the reverse of the last line
        out.println("Reverse of last line: " + reverse);

        //Command .replace is to replace a character(s) with another, in this case, replace "i" with "e"
        String rev_rep = reverse.replace("i", "e");
        out.println("Replaced line: " + rev_rep);

        //.toUpperCase() is a command to make every character in the string uppercase
        out.println("Capitalized string 3: " + string3.toUpperCase());

        out.println("Program Completed");
    }
}


/*
Sources:
https://www.geeksforgeeks.org/count-occurrences-of-a-word-in-string/
http://www.java67.com/2016/09/3-ways-to-count-words-in-java-string.html
https://stackoverflow.com/questions/2713655/reverse-a-given-sentence-in-java
 */