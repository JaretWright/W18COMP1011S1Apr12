package w18comp1011s1apr12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JWright
 */
public class FirstRunnable implements Runnable
{

    @Override
    public void run()
    {
        for (int i=10; i>=1; i--)
        {
            try
            {
                Thread.sleep(500);
                System.out.printf(" ---- %2d %s%n", i, Thread.currentThread().getName());
            } catch (InterruptedException ex)
            {
                Logger.getLogger(FirstRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("blastoff");
    }
    
}
