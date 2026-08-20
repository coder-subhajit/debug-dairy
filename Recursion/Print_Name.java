 public class Print_Name{
    static void printName(int i,int n){
        //base case
        if(i>n){
            return;
        }
        //print something
        System.out.println("Subhashree");
        //recursive call
        printName(i+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        printName(1,n);
    }
 }