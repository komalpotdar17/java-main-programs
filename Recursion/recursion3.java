public class recursion3 {
    public static int first = -1;
    public static int last = -1;
    public static void occurence(String str, int index, char ele){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);   
            return;    
        }
        char curChar = str.charAt(index);
        if(curChar == ele){
            if(first == -1){
                first = index;
            }  else {
                last = index;
            }  
        }

        occurence(str, index+1, ele);
    }
    public static void main(String args[]){
    String s= "aagwjdgja";
    occurence(s, 0, 'a');
    }
    
}
