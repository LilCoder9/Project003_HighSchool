
import java.util.*;

public class AcademicStatus2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declaration
        double GPA;
        
        //Input
        System.out.printf("What is your GPA? ");
        GPA = console.nextDouble();
        //Output (if)
        if( GPA < 0.0 || GPA > 4.0){
            System.out.printf("The grade point avergae must be with in the range 0.0 to 4.0 \n");
        }
        else if( GPA >= 0.0 && GPA <= 0.9){
            System.out.printf("Failed semester-registration suspended \n");
        }
        else if( GPA >= 1.0 && GPA <= 1.9){
            System.out.printf("On probation next semester \n");
        }
        else if( GPA >= 2.0 && GPA <= 2.9){
            System.out.printf("(NO MESSAGE) \n");
        }
        else if( GPA >= 3.0 && GPA <= 3.49){
            System.out.printf("Dean's list for semester \n");
        }
        else{// GPA IS BETWEEN 3.5 AND 4.0
            System.out.printf("Highest honors for semester \n");
        }
        
    }
}