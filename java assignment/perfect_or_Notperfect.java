import java.util.Scanner;

public class perfect_or_Notperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        for(int i = 1;i <= number/2;i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }
    }
}
