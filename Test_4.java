package Exercise;
import java.sql.SQLOutput;
import java.util.Scanner;
//判断是否为质数
public class Test_4 {
    public static void main(String args[]){
        boolean zhishu=true;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = s.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                zhishu=false;
                break;
            }
        }
        System.out.println(zhishu?"是质数":"不是质数");
    }
}
