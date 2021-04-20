
/**
 * Class EvenOdd
 * 
 */
import java.util.*;

public class EvenOdd
{
    public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       //Declarations
       int number;
       int remainder;
       //Input
       System.out.printf("Enter Integer: ");
       number = console.nextInt();
       //Math
       remainder = number % 2;
       if( remainder == 0 ){
           System.out.printf("Even \n");
        }
        else{ //odd
            System.out.printf("Odd \n");
        }
       switch(remainder){
           case 1: System.out.printf("Odd");
                   break;
           default: System.out.printf("Even");
        }
           
    }
}

