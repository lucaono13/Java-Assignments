public class Goalkeeper extends Player {

    private int GoalsSaved, GoalsConceded, TotalPoints;

    public Goalkeeper(String name, int age, int saved, int conceded)
    {
        //Super passed the name and age to the Player class creating the object with the name and age, then sets the remaining class variables
        super(name, age);
        GoalsConceded = conceded;
        GoalsSaved = saved;
        setTotalPoints(GoalsSaved - GoalsConceded);
    }

    public void printInfo()
    {
        //This runs the Player class .printInfo() method to print the first two lines
        super.printInfo();
        System.out.println("Type: Goalkeeper");
        System.out.println("Goals saved: " + GoalsSaved);
        System.out.println("Goals Conceded: " + GoalsConceded);
        System.out.println("Total Points: " + getTotalPoints());
    }


}
