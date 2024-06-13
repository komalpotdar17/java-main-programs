public class recursion4 {
    public static boolean isSorted(int arr[], int ind){
        if(ind == arr.length-1){
            return true;
        }
        if(arr[ind] >= arr[ind+1]){
            return false;
        } else{
            return isSorted(arr, ind+1);
           
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 1 , 3,5};
        System.out.println(isSorted(arr, 0));

    }
    
}
