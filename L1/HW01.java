package L1;

import java.util.Random;

public class HW01 {
    public static void main(String[] args) {
        int i = new Random().nextInt(-1000,1001);
        // import java.util.concurrent.ThreadLocalRandom;
        // int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Рандомное число от -1000 до 1000 = " + i);
    }
}
