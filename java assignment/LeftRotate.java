import java.util.*;

public class LeftRotate {
    
    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % n;   // 🔥 important fix

        // Step 1
        reverse(arr, 0, k-1);

        // Step 2
        reverse(arr, k, n-1);

        // Step 3
        reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}