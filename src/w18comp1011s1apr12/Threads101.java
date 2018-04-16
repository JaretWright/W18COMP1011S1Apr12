package w18comp1011s1apr12;

/**
 *
 * @author JWright
 */
public class Threads101
{
    public static void main(String[] args)
    {
        FirstRunnable r1 = new FirstRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
