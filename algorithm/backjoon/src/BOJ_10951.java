import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(true){
            try{
                System.out.println(a+b);
                a=sc.nextInt();
                b=sc.nextInt();
            }catch (Exception e){
                break;
            }
        }
    }
}
