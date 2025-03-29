package challengeTwo;

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String upperCase = convertToUpperCase(input);
        String lowerCase = convertToLowerCase(input);

        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    public static String convertToUpperCase(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {               
                chars[i] = (char) (ch - 32);
            } 
            else {
                chars[i] = ch; 
            }
        }
        return new String(chars);
    }

    public static String convertToLowerCase(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {                
                chars[i] = (char) (ch + 32);
            } else {
                chars[i] = ch; 
            }
        }
        return new String(chars);
    }
}
