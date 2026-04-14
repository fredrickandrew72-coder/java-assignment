import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        LinkedList<Integer> result = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] > max){
                result.addFirst(arr[i]); // no need to reverse
                max = arr[i];
            }
        }

        System.out.println(result);
    }
}