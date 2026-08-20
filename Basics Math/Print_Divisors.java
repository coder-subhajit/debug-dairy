import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Print_Divisors{
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=x.nextInt();
ArrayList<Integer>divisors=new ArrayList<>();
   for(int i=1;i*i<=n;i++){
    if(n%i==0){
    divisors.add(i);
    
    if(i!=n/i){
        divisors.add(n/i);
    }
}
    }
    Collections.sort(divisors);
    System.out.print("The divisors are:");
    for(int divisor:divisors){
        System.out.print(divisor+" ");
    }
   }
    }
