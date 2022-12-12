import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printArraySum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        System.out.println(sum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30};
        printArraySum(months);

    }
}
