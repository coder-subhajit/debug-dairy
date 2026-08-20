//check a number is palindrome or not

import java.util.Scanner;
public class Palindromic_Number {
 public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.print("Enter the number:");
     int num=x.nextInt();
     int dup=num;
     int rev=0;
     while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
     }
     if(rev==dup){
        System.out.print("The number is palindrome...");
     }else{
        System.out.print("The number is not palindrome...");
     }
 }
}