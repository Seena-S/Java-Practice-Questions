package challengeTwo;

import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.nextLine();

        String resultString = removeWord(inputString, wordToRemove);
        System.out.println("String after removing the word: " + resultString);
    }

    public static String removeWord(String str, String word) {
        
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String w : words) {
            
            if (!w.equals(word)) {
                result.append(w).append(" ");
            }
        }
     
        return result.toString().trim();
    }
}
