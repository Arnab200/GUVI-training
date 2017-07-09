import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         
         System.out.println("Enter the number of digits");
         Scanner a = new Scanner(System.in);
         int d=a.nextInt();
         int length = (int) Math.log10(d) + 1;
         System.out.println(length);
         

        
         
     
     }
}
