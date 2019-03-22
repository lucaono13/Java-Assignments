public class Player {
    private String Name;
    private int Age, TotalPoints;

    public Player(String name, int age)
    {
        //sets class variables
        Name = name;
        Age = age;
    }

    public void printInfo()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age + " years");
    }

    public boolean isLeading(Player p)
    {
        //if/else statement that print out who is leading by how many points
        if (p.TotalPoints > this.TotalPoints)
        {
            System.out.println(p.Name + " leads " + this.Name + " by " + (p.TotalPoints - this.TotalPoints) + " points.");
            return true;
        }
        else
        {
            System.out.println(this.Name + " leads " + p.Name + " by " + (this.TotalPoints - p.TotalPoints) + " points.");
            return false;
        }
    }
    //function to return the TotalPoints for an object
    public int getTotalPoints()
    {
        return this.TotalPoints;
    }

    //function to set the TotalPoints for each object
    public void setTotalPoints(int points)
    {
        this.TotalPoints = points;
    }
}
