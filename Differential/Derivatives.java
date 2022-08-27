/*Author: Shawn Cogan 
8/26/22
*/

package Differential;
//import java.util.Scanner;



public class Derivatives {

public static void powerFunction(String functionIn, String variable)
{
   String function = functionIn.replace(variable,"x");
   String pow = function.substring((function.indexOf("x^")+2));
   double power = Double.parseDouble(pow);
   System.out.println("" + (power +1) );

   System.out.println("The derivative of function " + functionIn + " with respect to " + variable + " is " + power);

   
}


public static void main(String[] args)
 {
    powerFunction("5t^24", "t");
   
   

 

}
    }