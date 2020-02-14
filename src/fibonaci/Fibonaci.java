
package fibonaci;
import java.util.Scanner;
/**
 *
 * @author SHOIKAT
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        int test = sn.nextInt();
        int a = 0, b = 1, next = 0, counter = 0;
        while(counter != test)
        {
            long N = sn.nextLong();
            counter++;
            for(int i = 1; i <= N-1; i++)
            {
                next = a + b;
                a = b;
                b = next;
            }
            System.out.println("Fib(" + N + ") = " + next);
            a = 0;
            b = 1;
        }
    }
    
}

