import java.util.Scanner;
public class Test {
    public static void main (String[] args){
       Scanner s =new Scanner(System.in);
       System.out.println("请输入成绩");
       float a=s.nextFloat();
String as="mistake";
        if(a>=0&&a<=100)
        {
            if(a>=90)
                as="ellecent";
            else if(a>=80)
                as="good";
            else if(a>=70)
               as="mefium";
            else if(a>=60)
                as="pass";
            else as="fail";
        }
        System.out.println(as);
    }
}
