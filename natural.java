import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int sum = 0;
            System.out.println("How many natural numbers to be added:");
            Scanner a = new Scanner(System.in);
            int p = a.nextInt();
            int arr[] = new int[p];
            System.out.println("Enter the "+p+" numbers to be added");
            Scanner d = new Scanner(System.in);
            for(int i=0; i < p; i++){
                 arr[i]= d.nextInt();
            }
            for(int j=0; j<p; j++){
                sum=sum+j;
            }
            System.out.println("Sum " + sum);
             
            
         
     }
}