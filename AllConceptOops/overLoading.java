package AllConceptOops;


// Method OverLoading in fuction name same but different parameters if same parameter java is confused and show runtime error.
public class overLoading {
    
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b, int c){
        return a+b+c;
    }
    public static int add(int []arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println("add a+b " + add(5,6));
        System.out.println();
        System.out.println("add a+b+c "+ add(5,6,10));
        System.out.println();
        int arr[] = {1,2,3,4,5};
        System.out.println(" Sum of Array "+add(arr));

    }
}
