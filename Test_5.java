package Exercise;
import java.util.Scanner;
//小三角
public class Test_5 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            for(int m=0;m<num-i;m++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
