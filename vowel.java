import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter a charater: ");
        Scanner a = new Scanner(System.in);
        char r = a.next().charAt(0);
        if(r == 'a' || r =='e'  || r == 'i' || r =='o' || r=='u'){
            System.out.println("The character entered is a vowel:");
        }
        else{
          System.out.println("The character entered is a consonant");
        }
            
        
        
        
        
     }
}
