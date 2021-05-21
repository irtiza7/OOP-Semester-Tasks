import java.util.Random;

public class Test{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] face = new int[7];

        for (int i = 0; i < 1000000; i++) {
            ++face[1 + rand.nextInt(6)];
        }

        for (int i = 1; i < face.length; i++) {
            double percentage;
            percentage = ((double) (face[i])/1000000*100);
            System.out.printf("Face[%d] = %d with Percentage = %.2f%%\n", i, face[i], percentage);
        }
    }
}