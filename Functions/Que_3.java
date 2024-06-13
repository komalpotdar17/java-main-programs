import java.util.*;

public class Que_3 {
    public static void fibonacci(int n){
    	
    	int fNum = 0;
    	int sNum = 1;
    	for(int i=0; i<n; i++){
    		System.out.println(fNum);
    		int nextNum = fNum + sNum;
    		fNum = sNum;
    		sNum = nextNum;
    	}
   
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("Enter a number:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       fibonacci(n);
       
             
       
	}

}
