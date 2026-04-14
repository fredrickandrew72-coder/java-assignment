import java.util.Scanner;

public class Reverse_Integer{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        long number = sc.nextLong();
        long  num = 0;
        while(number>0){
            num = num * 10 + number % 10;
            number = number / 10;
        } 
        if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
            System.out.println("reverse = "+num);
        }
        else{
            System.out.println("0");
        }
    }
}