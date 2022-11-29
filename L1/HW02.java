package L1;
import java.util.Random;

public class HW02 {
    static int setBitNumber(int n)
    {
        if (n == 0)
            return 0;
 
        int msb = 0;
        n = n / 2;
 
        while (n != 0) {
            n = n / 2;
            msb++;
        }
 
        return (1 << msb);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = new Random().nextInt(1,11);
        System.out.println(n);
        System.out.println(setBitNumber(n));
    }
}

