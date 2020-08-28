package Exercise;
import java.util.Scanner;
//九九乘法表
public class Nine_Nine {
    public static void main(String args[]){
      for(int i=1;i<=9;i++){
          for(int k=1;k<=i;k++){
              System.out.print(k+"*"+i+"="+i*k+" ");
          }
          System.out.println();
      }

    }
}
