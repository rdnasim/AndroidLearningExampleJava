package practice_onboarding.AddTwoArrays;

import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numArrayA = new int[N];
        int[] numArrayB = new int[N];
        int[] sumArray = new int[N];


        for (int i = 0; i < N; i++) {
            numArrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            numArrayB[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            sumArray[i] = numArrayA[i] + numArrayB[i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(sumArray[i] + " ");
        }

        System.out.println();
    }
}
