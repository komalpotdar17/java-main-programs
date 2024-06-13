public class AdvancedRecursion1 {

    public static void printPermu(String str, String permu){
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermu(newStr, permu+curChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermu(str, "");
    
    }
    
}
