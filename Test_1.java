package Exercise;
//计算一千以内不能被七整除的数之和
public class Test_1 {
    public static void main(String args[]){
        int num=0;
        for(int i=1;i<=1000;i++){
            if(i%7!=0){
                num=num+i;
            }else continue;
        }
        System.out.println(num);
    }
}
