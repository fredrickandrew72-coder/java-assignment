import java.util.Scanner;

public class duplicate_number_startcycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println("Duplicate: " + slow);
    }
}
