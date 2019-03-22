public class OnoratoGianlucaA6 {

    public static void main(String arg[])
    {
        //Creates new objects a and g as Attacker and Goalkeeper respectively
        Attacker a = new Attacker("Lionel Messi", 29, 3, 0);
        Goalkeeper g = new Goalkeeper("Petr Cech", 34, 5, 1);

        a.printInfo();
        System.out.println();
        g.printInfo();

        g.isLeading(a);

        System.out.println("Program Completed");
    }
}
