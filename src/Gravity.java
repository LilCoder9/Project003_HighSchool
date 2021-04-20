
/**
 * Class Gravity
 * 
 */
import java.util.*;

public class Gravity
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declarations
        int planet;
        double weight;
        double finalweight=0;
        //Input
        System.out.printf("Enter  your weight: ");
        weight = console.nextDouble();
        System.out.printf("Planet numbers: \n 1 = Mercury 2 = Venus 3 = Earth \n 4 = Mars   5 = Jupiter 6 = Saturn \n 7 = Uranus 8 = Neptune 9 = Pluto \n ");
        System.out.printf("Which Planet?");
        planet = console.nextInt();
        
        switch(planet){
            case 1: finalweight = weight * .38;
                    break;
            case 2: finalweight = weight * .78;
                    break;
            case 3: finalweight = weight * 1;
                    break;
            case 4: finalweight = weight * .39;
                    break;
            case 5: finalweight = weight * 2.65;
                    break;
            case 6: finalweight = weight * 1.17;
                    break;
            case 7: finalweight = weight * 1.05;
                    break;
            case 8: finalweight = weight * 1.23;
                    break;
            case 9: finalweight = weight * .05;
                    break;
            default: System.out.printf("Unknown planet! ");
        }
        if( planet >= 1 && planet <= 9){
            System.out.printf("Your weight will be %.2f pounds.", finalweight);
        }
       
        
    }
}

