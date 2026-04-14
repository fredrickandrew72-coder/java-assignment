import java.util.Scanner;

public class prime_and_count {
    static int prime(int n){
        int count = 0;
        for(int i=2 ; i <= n;i++){
            boolean isPrime = true;
           for(int j = 2; j <= i/2;j++ ){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
         if (number<=1){
            System.out.println("prime Number");
        }
        int total =prime(number);
        System.out.print("\ncount = "+total);
    }
}
