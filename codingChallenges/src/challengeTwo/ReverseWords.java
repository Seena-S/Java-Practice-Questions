package challengeTwo;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWords(String str) {
        StringBuilder reversed = new StringBuilder();
        String[] words = str.split(" "); 

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]); 
            if (i != 0) {
                reversed.append(" "); 
            }
        }
        return reversed.toString(); 
    }
}
