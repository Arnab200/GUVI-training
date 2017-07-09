import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a charater: ");
        Scanner a = new Scanner(System.in);
        char r = a.next().charAt(0);
       if(r >= 'a' && r <='z' || r >= 'A' && r <= 'Z'){
           System.out.println("The character entered is an alphabet");
       }  
       else{
           System.out.println("The charater entered was not an alphabet");
       }
        
        
        
        
     }
}
