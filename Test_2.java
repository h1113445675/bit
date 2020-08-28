package Exercise;
//求和：1+2-3+4-5+...+100;
public class Test_2 {
    public static void main(String args[]){
        int num=0;
        int a;
        for(int i=1;i<=100;i++){
            a=i%2;
            switch(a) {
                case 0:
                    num = num + i;
                    break;
                case 1:
                    num = num - i;
                    break;
            }
        }
        num=num+2;
        System.out.println(num);
    }
}
