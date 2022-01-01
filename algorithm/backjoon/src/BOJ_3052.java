import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int[] arr2 = new int[42];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
            int num = arr[i] % 42;
            if (arr2[num] != 1) {
                arr2[num] = 1;
                count++;
            }
        }
        System.out.print(count);
    }

}

