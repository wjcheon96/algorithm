import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mul = a*b*c;
        String num[] = (""+mul).split("");
        int n;
        int count=0;

        for(int i=0; i<=9;i++){
            for(int j=0; j<num.length;j++){
                n=Integer.parseInt(num[j]);
                if(i == n){
                    count++;
                }
            }System.out.println(count);
            count=0;
        }
    }
}
