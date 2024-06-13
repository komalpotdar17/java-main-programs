public class ReverseString {
    public static void reverse(String s, int ind){
        if(ind==0){
            System.out.print(s.charAt(ind));
            return;
        }
        System.out.print(s.charAt(ind));
        reverse(s, ind-1);
    }
    public static void main(String args[]){
        String s="abcd";
        reverse(s,s.length()-1);
    }
}
