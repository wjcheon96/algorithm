import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int i;
        int count=0;
        for(i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<9;i++){
            if(num<arr[i]){
                num=arr[i];
                count=i+1;
            }
        }
        System.out.println(num);
        System.out.println(count);
    }
}
