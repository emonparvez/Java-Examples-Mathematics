
package java_example_mathematics;

import java.util.Scanner;


public class Palindrome_OR_Not {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= sc.nextInt();
        
        int sum=0,r;
       
        int test=321;
       
       
        while(n!=0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        
        if(sum==test){
            System.out.println("This is not Palindrome number");
        }
        else{
            System.out.println("This is Palindrome number");
        }
        
    }
    
}
