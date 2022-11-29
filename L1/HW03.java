package L1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HW03 {
    static int[] multipleOfNumber(int[] arrayN,int n) {
        int[] m1 = new int[arrayN.length/2];
        int j = 0;
        for (int i = 0; i < arrayN.length; i++) {
            if (n % arrayN[i] == 0){
                    m1[j] = arrayN[i];
                    j++;
                }
            }

        return m1;
    }
    public static void main(String[] args) {
        int n = new Random().nextInt(1,Short.MAX_VALUE);
        int[] arrayN = IntStream.rangeClosed(1, n).toArray();
        System.out.println(Arrays.toString(multipleOfNumber(arrayN,n)));
        System.out.println("Мы искали числа, на которые делится " + n);
    }
}
