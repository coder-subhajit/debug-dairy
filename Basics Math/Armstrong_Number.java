//check a number is armstrong number or not

import java.util.Scanner;
public class Armstrong_Number{
 public static void main(String[] args) {
     Scanner x=new Scanner(System.in);
     System.out.print("Enter the number:");
     int num=x.nextInt();
     int org=num;
     int count=0;
     int sum=0;
     //count the no of digits
    while(num>0){
        count++;
        num=num/10;
    }
    num=org;
    //count the armstrong sum
    while(num>0){
        int digit=num%10;
        sum=sum+(int)Math.pow(digit,count);
        num=num/10;
    }
    if(sum==org){
        System.out.print("The number is armstrong...");
    }else{
        System.out.print("The number is not armstrong...");
    }
 }
}