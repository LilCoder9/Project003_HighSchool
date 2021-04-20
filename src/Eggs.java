
import java.util.*;

public class Eggs
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declarations
        int eggs;
        int dozens;
        int extras;
        double cost;
        double extracost;
        
        //Input
        System.out.printf("How many eggs are you purchasing? ");
        eggs = console.nextInt();
        
        //Math
        dozens = eggs / 12;
        extras = eggs % 12;
        
        //Output if
        if( dozens < 4){
            extracost = (.5 / 12) * extras;
            cost = (.5 * dozens) + extracost;
            System.out.printf("The bill is equal to: $%.2f", cost);
        }
        else if( dozens >= 4 && dozens < 6){
            extracost = (.45 / 12) * extras;
            cost = (.45 * dozens) + extracost;
            System.out.printf("The bill is equal to: $%.2f", cost);
        }
        else if( dozens >=6 && dozens < 11){
            extracost = (.4 / 12) * extras;
            cost = (.4 * dozens) + extracost;
            System.out.printf("The bill is equal to: $%.2f", cost);
        }
        else{//11 dozens or more
            extracost = (.35 / 12) * extras;
            cost = (.4 * dozens) + extracost;
            System.out.printf("The bill is equal to: $%.2f", cost);
        }
        }
            
        
    }
