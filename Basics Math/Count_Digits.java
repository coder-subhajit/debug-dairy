//count all digits of a number

import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int n=x.nextInt();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        } System.out.print("The no of digits:"+count);
    }
}
