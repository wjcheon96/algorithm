import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int copy = num;
        int newNum = 0;
        int count = 1;
        sc.close();

        while(true){
            newNum = (num%10)*10 + ((num/10)+(num%10))%10;
            if(copy == newNum){
                break;
            }
            num = newNum;
            count++;
        }
        System.out.println(count);

    }
}
