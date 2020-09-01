package Exercise;//实例方法 设计日期类 每个对象可以描述日期
import java.util.Scanner;
public class Object_1 {
    public static void main(String args[]){
        Date c1 = new Date();
        System.out.println("请输入年月日");
        Scanner s = new Scanner(System.in);
        c1.setDate(s.nextInt(),s.nextInt(),s.nextInt());
        c1.getDate();
    }

}
class Date{
    int year;
    int month;
    int day;
    void  getDate(){
        System.out.println("日期为"+year+"."+month+"."+day);
    }
    void setDate(int a,int b,int c){
        this.year=a;
        this.month=b;
        this.day=c;
    }
}