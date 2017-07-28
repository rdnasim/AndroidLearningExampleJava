package practice_onboarding;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int Sum = num1 + num2;

        System.out.println(Sum);
        scanner.close();
    }
}
