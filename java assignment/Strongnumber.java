import java.util.Scanner;

public class Strongnumber{
    static int factorial(int n){
        if(n == 0||n==1){
            return n;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int original = number;
        long sum=0;

        while (number != 0){
            int digit = number % 10;
            sum += factorial(digit);
            number = number / 10;
        }
        
        if (sum == original) {
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not Strong Number");
        }
    }
}
