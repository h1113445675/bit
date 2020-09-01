package Exercise;

public class Object_2 {
    public static void main(String args[]){
        Book b1 = new Book();
        b1.detail();
        b1.setPageNum(10);
        b1.setTitle("English");
        b1.detail();
        b1.setPageNum(299);
        b1.detail();
    }
}
 class Book{
    private String title;
    private int pageNum;
    public Book(){
        int pageNum=200;
    }
    void setPageNum(int a){
        if (a<200)
                System.out.println("PageNum Error!");
        pageNum=a;
    }
     void setTitle(String a){
        title=a;
     }
     void detail(){
        System.out.println("Title："+title+" "+"PageNum："+pageNum);
     }
}