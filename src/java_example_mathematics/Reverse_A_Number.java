
package java_example_mathematics;

import java.util.Scanner;


public class Reverse_A_Number {
 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= sc.nextInt();
        
        int sum=0,r;
       
       
       
       
        while(n!=0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println("Reverse number is : " + sum);
    }
}
