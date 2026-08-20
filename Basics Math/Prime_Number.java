import java.util.Scanner;
public class Prime_Number{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=x.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print("The number is prime...");
        }
        else{
            System.out.print("The number is not prime...");
        }
    }
}