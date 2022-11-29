package L1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HW04 {
    static int[] notMultipleOfNumber(int[] arrayN,int n) {
        int[] m1 = new int[arrayN.length];
        int j = 0;
        for (int i = 0; i < arrayN.length; i++) {
            if (arrayN[i] % n != 0){
                    m1[j] = arrayN[i];
                    j++;
                }
            }

        return m1;
    }
    public static void main(String[] args) {
        int n = new Random().nextInt(-100,101);
        int[] arrayN = IntStream.rangeClosed(Short.MIN_VALUE, 1).toArray();
        System.out.println(Arrays.toString(notMultipleOfNumber(arrayN,n)));
        System.out.println("Мы искали числа, которые не делятся на " + n);
    }
}
