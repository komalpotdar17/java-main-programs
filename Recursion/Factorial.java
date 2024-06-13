public class Factorial {
    public static int printFac(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm1= printFac(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }

    public static void main(String args[]){

        int n = printFac(5);
        System.out.println(n);
    }
}
