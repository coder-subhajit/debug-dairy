//reverse a number

import java.util.Scanner;
public class Reverse_Number {
 public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.print("Enter the number:");
     int num=x.nextInt();
     int rev=0;
     while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
     }
     System.out.print("The reverse number:"+rev);
 }
}
