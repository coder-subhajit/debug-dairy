import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the two numbers:");
        int n1=x.nextInt();
        int n2=x.nextInt();
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.print("GCD is:"+n1);
    }
}
