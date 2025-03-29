package challengeTwo;

import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        printRepeatedCharacters(input);
    }

    public static void printRepeatedCharacters(String str) {
        System.out.println("Repeated characters:");

        char[] chars = str.toCharArray();
        boolean[] checked = new boolean[chars.length]; //A boolean array is created to keep track of which characters have already been counted.

        for (int i = 0; i < chars.length; i++) {
            if (!checked[i]) {
                int count = 1;

                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        checked[j] = true; 
                    }
                }

                if (count > 1) {
                    System.out.println(chars[i] + ": " + count + " times");
                }
            }
        }
    }
}
