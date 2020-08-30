package Exercise;//递归计算n的阶乘
import java.util.Scanner;
public class Recursion_1 {
    public static void main(String args []){
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(factorial(m));
    }
    public static int factorial(int n){
        if(n==1)
            return 1;
        else return n*factorial(n-1);
    }
}
