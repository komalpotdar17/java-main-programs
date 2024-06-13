import java.util.Scanner;

public class QueOne {
    public static void OddSum(int n){
    for(int i=1;i<=n;i++){
    	if(i%2==0){
    		
    	}
    	else
    	System.out.println(i);
    }
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter n number");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        OddSum(n);
	}

}
