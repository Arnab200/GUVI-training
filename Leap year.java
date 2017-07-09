import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a Year: ");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        if(r%4 == 0 && (r%400 == 0 || r%100 != 0)){
            
            System.out.println("The year entered is leap year");
        }
        else{
            System.out.println("The year entered is not a Leap year");
        }
       
       
        
        
        
        
     }
}
