import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter First number: ");
        Scanner a = new Scanner(System.in);
        int r = a.nextInt();
        
        System.out.println("Enter Second number: ");
        Scanner b = new Scanner(System.in);
        int p = b.nextInt();
        
        System.out.println("Enter Third number: ");
        Scanner c = new Scanner(System.in);
        int q = c.nextInt();
        
        if(r>p){
            if(r>q){
                System.out.println("Largest Number is" + r);
            }
        }
        else if(p>q){
            if(p>r){
                System.out.println("Largest Number is" + p);
            }
        }
        else{
            System.out.println("Largest Number is" + q);
        }
        
        
     }
}
