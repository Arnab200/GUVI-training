import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int sum = 0;
        System.out.println("Enter the Sum of numbers to be calculated:");
javascript:void(0)      Scanner a = new Scanner(System.in);
      int b = a.nextInt();
      for(int i = 0; i < b; i++){
         sum = sum + i;
         
      }
       System.out.println("Sum of first " +b+ " natural numbers is " + sum);
      
       
       
        }
}