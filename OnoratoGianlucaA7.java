public class OnoratoGianlucaA7 extends Thread{
    public void start(int a)
    {
        System.out.println("A thread has been created");
        for (int i = 1; i <= 7; i++)
        {
            try{Thread.sleep(a);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(this.getName() + " is outputting " + i);
        }
    }

    public void start()
    {
        System.out.println("A thread has been created");
        try {
            for (int i = 1; i <= 50; i++) {


                System.out.println(this.getName() + " is printing " + i);
                //Thread.yield();
            }
        } catch (Exception e){};

    }

    public void start(int begin, int end)
    {
        System.out.println("A thread has been created");
        for (int i = begin; i <= end; i++)
        {
            System.out.println("Printing " + i + " from " + this.getName());
            try{ Thread.sleep(33);}catch (InterruptedException e){System.out.println(e);}
        }
    }

    public static void main(String arg[])
    {
        OnoratoGianlucaA7 t1 = new OnoratoGianlucaA7();
        OnoratoGianlucaA7 t2 = new OnoratoGianlucaA7();
        OnoratoGianlucaA7 t3 = new OnoratoGianlucaA7();

        t3.start(3,30);
        t1.start(2,20);
        try{
            t3.join();
        }catch (Exception e){System.out.println(e);}
        t2.start(5,50);

        System.out.println("Program Completed");

    }
}
