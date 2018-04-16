package w18comp1011s1apr12;

import java.util.Set;

/**
 *
 * @author JWright
 */
public class RaceConditionsPart2
{
    static int counter = 1;
    
    public static synchronized int getCounter()
    {
        return counter++;
    }
    
    public static void main(String[] args)
    {
        Runnable r1 = () -> System.out.printf("Counter: %d thread: %s%n",
                                     getCounter(), Thread.currentThread().getName());
        
        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r1, "T2");
        t1.start();
        t2.start();
        
        Set<Thread> activeThreads = Thread.getAllStackTraces().keySet();
        
        for (Thread thread:activeThreads)
            System.out.printf("Thread: %s%n", thread.getName());
    }
}
