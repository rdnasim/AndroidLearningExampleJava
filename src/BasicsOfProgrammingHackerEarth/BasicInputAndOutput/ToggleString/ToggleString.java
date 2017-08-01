package BasicsOfProgrammingHackerEarth.BasicInputAndOutput.ToggleString;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String result = new String("");
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i)))
                result += Character.toLowerCase(string.charAt(i));
            else
                result += Character.toUpperCase(string.charAt(i));
        }

        System.out.println(result);

    }
}
