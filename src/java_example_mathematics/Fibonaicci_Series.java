
package java_example_mathematics;


public class Fibonaicci_Series {
    
    
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int i = 0;
        System.out.print(first + " " + second+ " ");
        
        while(i <100){
            
            i=first+second;
            System.out.print(i +" ");
            first=second;
            second=i;
            
            
        }
    }
}
