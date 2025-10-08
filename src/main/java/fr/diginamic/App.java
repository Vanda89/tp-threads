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

        Animal turtle = new Animal("Tortue", "🐢",  race);
        Thread t1 = new Thread(turtle, "TurtleThread");
        t1.start();

        Animal rabbit = new Animal("Lapin", "🐇" , race);
        Thread t2 = new Thread(rabbit, "RabbitThread");
        t2.start();

        Animal duck = new Animal("Canard", "🪿", race);
        Thread t3 = new Thread(duck, "DuckThread");
        t3.start();

        Animal pig = new Animal("Cochon", "🐖", race);
        Thread t4 = new Thread(pig, "PigThread");
        t4.start();

        System.out.println();


    }
}
