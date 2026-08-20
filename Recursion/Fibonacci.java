import java.util.Scanner;
public class Fibonacci {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=x.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
            x.close();
    }
}
