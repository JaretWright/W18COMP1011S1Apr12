package w18comp1011s1apr12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class RaceConditionExample
{
    static int num1, num2;
    
    public static void main(String[] args)
    {
        num1=20;
        
        Runnable r1 = () -> {
                if (num1 == 20)
                {
                    try {
                        Thread.sleep(10);
                        num2 = num1/2;
                        System.out.printf("The value of num2 is: %d%n", num2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RaceConditionExample.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                    System.out.printf("The value of num1 is: %d%n", num1);
            };
        
        Runnable r2 = () -> num1=2;
        
        Thread t1 = new Thread(r1, "Division thread");
        Thread t2 = new Thread(r2, "num1=2 Thread");
        t1.start();
        t2.start();
    }
}
