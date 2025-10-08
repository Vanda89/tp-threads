package fr.diginamic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Race race = new Race(4);


        Thread t1 = new Thread(new Turtle(race));
        t1.start();

        Thread t2 = new Thread(new Rabbit(race));
        t2.start();


        Thread t3 = new Thread(new Duck(race));
        t3.start();

        Thread t4 = new Thread(new Pig(race));
        t4.start();

        Thread arbiterThread = new Thread(new Arbiter(race));
        arbiterThread.start();

    }
}
