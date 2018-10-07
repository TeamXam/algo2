import java.util.Arrays;
import java.util.Random;

public class mssiv {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[6554000];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(999);




        }
        System.out.println(Arrays.toString(array));

        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
