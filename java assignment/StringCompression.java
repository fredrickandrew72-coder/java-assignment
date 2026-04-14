import java.util.Scanner;

public class StringCompression {
    public static String compress(String s) {
        if (s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        result.append(s.charAt(s.length() - 1));
        result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();   

        String result = compress(s);

        System.out.println("Compressed string: " + result);

    }
}