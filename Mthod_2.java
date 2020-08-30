package Exercise;//求大于某个整数的最小质数
import java.util.Scanner;
public class Mthod_2 {
    public static void main (String args[]){
        System.out.println("请输入一个正整数");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt() ;
        int result = smallestPrime(a);
        System.out.println("这个数为"+result);
    }
    public static int smallestPrime( int b ){
        int c;
        for(int i=2;i<=1000;i++){//输出从1-1000的数
            for(int x=2;x<i;x++){//判断是否为质数
                if(i%x==0){
                    break;
                }else {
                    if (i > b) {
                        c = i;
                        return c;
                    }
                }
            }
        }
        return 0 ;
    }
}
