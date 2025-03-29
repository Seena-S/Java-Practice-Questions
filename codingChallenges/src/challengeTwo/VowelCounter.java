package challengeTwo;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou"; 

        for (char ch : str.toCharArray()) {
           
            if (vowels.indexOf(ch) != -1) {
                count++; 
            }
        }

        return count; 
    }
}
