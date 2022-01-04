import java.util.Scanner;

public class BOJ_1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int i;
        int max = 0;
        double total = 0;
        for (i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            if (max <= score[i]) {
                max = score[i];
            }
        }
        for (i = 0; i < n; i++) {
            double temp;
            temp = ((double)score[i] / max) * 100;
            total = temp + total;
        }

        System.out.println(total / n);
    }
}