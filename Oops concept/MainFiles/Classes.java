package MainFiles;

public class Classes {
    String color;
    int num;

    void init(String s,int n){
        color = s;
        num = n;
    }
    void display(){
        System.out.println(color+" "+num);
    }
 public static void main(String[] args) {
    Classes diag = new Classes();
    diag.init("Red", 10);
    System.out.println("_________________");
    System.out.println();
    diag.display();
    System.out.println("_________________");
 }   
}
