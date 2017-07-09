import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a number: ");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        int b = r%2;
        if(b==0){
            System.out.println("The number entered is Even");
        }
        else{
            System.out.println("The number entered is Odd");
        }
        
     }
}
