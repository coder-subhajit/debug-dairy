import java.util.Scanner;
public class Sum_N_Number {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=x.nextInt();
        System.out.print("Sum:"+sum(n));
        x.close();
    }
}
