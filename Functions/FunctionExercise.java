
import java.util.*;

public class FunctionExercise {
    public static void PrintAvg(int n1, int n2, int n3){
        int sum, avg;
    	sum=n1 + n2 + n3;
    	avg = sum / 3;
    	System.out.println("Average = "+avg);		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		PrintAvg(n1,n2,n3);
			

	}

}
