package Exercise;//求阶乘
import java.util.Scanner;
public class Mthod_1 {
    public static void main(String args[]){
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int sum = factorial(a);

        System.out.println("结果为"+sum);

    }
    //阶乘方法，for循环
    public static int factorial(int a){
        int sum=1;
        for(int i=a;i>0;i--){
            sum*=i;
        }
        return sum;
    }
}
