import java.util.Scanner;
public class Factorial {
   static int fact(int n){
    //base case
    if(n==0||n==1){
        return 1;
    }
    //recursive call
     return n*fact(n-1);
   } 
   public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=x.nextInt();
    System.out.println("Factorial:"+fact(n));
    x.close();
   }
}
