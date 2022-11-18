/**
 * recirrional
 */
public class recirrional {

    public static void main(String[] args) {
        int x = 2 , n = 8;
		int ans = print(x,n);
		System.out.print(ans);
    }
	
	public static int print(int x , int n){
	    if(n==0){
	        return 1;
	    }
	   int val = print(x,n/2);
	   if(n%2==0){
	       return val*val;
	   }else{
	       return val*val*x;
	   }
	}
}
    
