package challengeTwo;
import java.util.Scanner;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeFirstAndLastCharacter(input);
        System.out.println("String after removing first and last character: " + result);
    }
    public static String removeFirstAndLastCharacter(String str) {        
        if (str.length() <= 2) {
            return ""; 
        }        
        return str.substring(1, str.length() - 1);
    }
}
