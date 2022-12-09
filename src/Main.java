import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][] result = new int[2][];
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};


    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

