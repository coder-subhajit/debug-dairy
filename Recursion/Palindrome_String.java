public class Palindrome_String {
    static boolean pal(char[] s,int left,int right){
        //base cse
        if(left>=right){
        return true;
        }
        //character's does not match
        if(s[left]!=s[right]){
            return false;
        }
        //recursive call
        return pal(s,left+1,right-1);
    }
    public static void main(String[] args) {
        String str="madam";
        char[] s=str.toCharArray();
        boolean result=pal(s,0,s.length-1);
        if(result){
            System.out.print("Palindrome...");
        }
        else{
            System.out.print("Not Palindrome...");
        }
    }
}
