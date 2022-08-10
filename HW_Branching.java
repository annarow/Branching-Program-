
/**
 * Program which asks for user input of store sales for three stores to 
 * then determine the average sales of store which passed the sales threshold.
 *
 * By: Anna Waldron
 * Date: 4/20/2020
 */
import java.util.Scanner;
public class HW_Branching
{
    //main function which takes in user input as bouldes and passes
    //the values into the branching function.
    public static void main(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sales for Store 1:");
        double store_1 = keyboard.nextDouble();
        System.out.println("Enter the sales for Store 2:");
        double store_2 = keyboard.nextDouble();
        System.out.println("Enter the sales for Store 3:");
        double store_3 = keyboard.nextDouble();
        System.out.println("Enter the sales threshold:");
        double threshold = keyboard.nextDouble();
        System.out.println();
        branches(store_1, store_2, store_3, threshold);
    }
    
    //Takes as parameters the sales of each store and the threshold in sales
    //to go into branching of if/else statements to calculate and print out
    //the average sales of stores who passed the sales threshold. Returns
    //to end the program.
    public static void branches(double s_1, double s_2, double 
    s_3, double limit){
        double average = 0.0;
        if(s_1 >= limit && s_2 >= limit && s_3 >= limit){
            average = (s_1 + s_2 + s_3) / 3.0;
            System.out.println("Stores 1 and 2 and 3 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average); //uses printf to round decimal numbers.
            return;
        }
        else if(s_1 >= limit && s_2 >= limit && s_3 < limit){
            average = (s_1 + s_2) / 2.0;
            System.out.println("Stores 1 and 2 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 >= limit && s_2 < limit && s_3 >= limit){
            average = (s_1 + s_3) / 2.0;
            System.out.println("Stores 1 and 3 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 >= limit && s_2 < limit && s_3 < limit){
            average = s_1;
            System.out.println("Store 1 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 < limit && s_2 >=limit && s_3 <limit){
            average = s_2;
            System.out.println("Store 2 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 < limit && s_2 >= limit && s_3 >= limit){
            average = (s_2 + s_3) / 2.0;
            System.out.println("Stores 2 and 3 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 < limit && s_2 < limit && s_3 >= limit){
            average = s_3;
            System.out.println("Store 3 did great!");
            System.out.printf("The average sales for exceeding stores:" +
            " %.2f", average);
            return;
        }
        else if(s_1 < limit && s_2 < limit && s_3 < limit){
            System.out.println("No store met the threshold");
            return;
        }
        return;
    
    }
    

}
