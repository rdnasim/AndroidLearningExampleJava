package practice_onboarding.SumOfSquares;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numArray = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            numArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            sum += numArray[i] * numArray[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}
