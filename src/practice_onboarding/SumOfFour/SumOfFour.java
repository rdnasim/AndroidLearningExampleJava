package practice_onboarding.SumOfFour;

import java.util.Scanner;

public class SumOfFour {
    public static void main(String[] args) {
        int[] numArray = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            numArray[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += numArray[i];
        }

        System.out.println(sum);
    }
}
