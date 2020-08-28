package Exercise;
import java.util.Scanner;
//求阶乘
public class Test_3 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum=1;
        for(;a>0;a--){
            sum=sum*a;
        }
        System.out.println("结果为"+sum);
    }
}
