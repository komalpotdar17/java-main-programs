import java.util.Scanner;

public class Que_4 {
    public static double circumference(int r){
    double cir = 0;
    final double PI = 3.16;
    
    cir = 2 * PI * r;
    
    return cir;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter the radius");
        Scanner sc = new Scanner(System.in);
        
        int radius = sc.nextInt();
        
        double cir = circumference(radius);
        System.out.println("Circumference is "+cir);
        
	}

}
