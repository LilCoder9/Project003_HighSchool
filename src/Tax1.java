
/**
 * Tax1
 * 
 */
import java.util.*;

public class Tax1
{
public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       //Declaration
       double salary;
       double tax;
       double finaltax;
       double excess;
       //Input
       System.out.printf("Enter your salary in dollars: ");
       salary = console.nextDouble();
       //Math
       if( salary >= 0 && salary <= 1499.99){
           excess = salary - 0;
           tax = excess * .15;
           finaltax = tax + 0;
        }
       else if( salary >= 1500 && salary <= 2999.99){
           excess = salary - 1500;
           tax = excess * .16;
           finaltax = tax + 225;
        }
        else if ( salary >= 3000 && salary <= 4999.99){
            excess = salary -3000;
            tax = excess * .18;
            finaltax = tax + 465;
        }
        else if( salary >= 5000 && salary <= 7999.99){
            excess = salary - 5000;
            tax = excess * .2;
            finaltax = tax + 825;
        }
        else{ // 8,000 - 15,000
            excess = salary - 8000;
            tax = excess * .25;
            finaltax = tax + 1425;
        }
        System.out.printf("The total tax due is $%.2f", finaltax);
               
    }
}
