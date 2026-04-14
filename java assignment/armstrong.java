import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int count=0;
        int temp =0;
        int original=number;
        while (number != 0) {
            count++;
            number = number/10;
        }
        while(number != 0){
            temp += number % 10 ^ count; 
            number = number / 10;
        }
        if (temp == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
