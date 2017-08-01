package practice_onboarding.RangeOfIntegers;

import java.util.Scanner;

public class RangeOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();
        int R = scanner.nextInt();

        for (int i = L; i <= R; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        scanner.close();
    }
}
