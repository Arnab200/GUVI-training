import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a number: ");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        if(r>0){
            System.out.println("The number entered is Positive");
        }
        else if(r==0){
            System.out.println("The number entered is Zero");
        }
        else{
            System.out.println("The number entered is Negative");
            
        }
     }
}
