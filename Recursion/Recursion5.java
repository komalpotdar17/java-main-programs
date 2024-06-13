public class Recursion5 {

    public static void moveAllx(String str, int ind, int count, String newstr){
       if(ind == str.length()){
        for(int i=0;i<count;i++){
            newstr +='x';
        }  
        System.out.print(newstr);
        return;
       }
       
        char curChar = str.charAt(ind);
        if(curChar == 'x'){
            count++;

            moveAllx(str, ind+1, count, newstr);
        }else{
            newstr += curChar;
            moveAllx(str, ind+1, count, newstr);
        }
    }
    public static void main(String args[]){
    String str = "axvwgxxsxkh";
    moveAllx(str, 0, 0, "str");
    }
    
}
