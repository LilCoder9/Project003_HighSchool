import java.util.*;

/**
 * Telephone.java
 * 
 */
public class Telephone
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Declarations
        int startcall;
        int endcall;
        int startcall_hours;
        int startcall_mins;
        int start_mins; //total minutes of start call
        int endcall_hours;
        int endcall_mins;
        int end_mins;
        int totaltime;
        double call_cost;
        double discount;
        double overtime;
        double tax;
        double finalcost;
        double gross_cost;
        //Input
        System.out.printf("Enter the time the call begins in 24 hour format:");
        startcall = console.nextInt();
        System.out.printf("Enter the time the call ends in 24 hour format:");
        endcall = console.nextInt();
        //Math
        startcall_hours = startcall / 100;
        startcall_mins = startcall % 100;
        start_mins = (startcall_hours * 60) + startcall_mins;
        endcall_hours = endcall / 100;
        endcall_mins = endcall % 100;
        end_mins = (endcall_hours * 60) + endcall_mins;
        totaltime = end_mins - start_mins;
        call_cost = totaltime * .4;
        gross_cost = call_cost;
        if( startcall >= 1800 && startcall <= 800){
           discount = call_cost * .5;
           call_cost = call_cost - discount;
        }
        if ( totaltime > 60){
            overtime = call_cost * .15;
            call_cost = call_cost - overtime;
        }
        tax = call_cost * .04;
        finalcost = call_cost + tax;

        //Output
        System.out.printf("Call summary: \n");
        System.out.printf("Started at %d for %d minutes.\n", startcall, totaltime);
        System.out.printf("The gross cost of the call is $%.2f \n", gross_cost);
        System.out.printf("The net cost of the call is $%.2f \n", finalcost);
        
        
        
        
    }
}
