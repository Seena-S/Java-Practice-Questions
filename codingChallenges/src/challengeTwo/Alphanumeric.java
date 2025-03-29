package challengeTwo;

public class Alphanumeric {
    public static void main(String[] args) {

        String input = "75#41*";
        String digits = displayDigits(input);
        System.out.println("Output: " + digits);
    }

    public static String displayDigits(String str) {
        StringBuilder digit = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit.append(ch);
            }
        }
        return digit.toString();
    }
}
