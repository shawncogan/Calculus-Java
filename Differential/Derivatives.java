/*Author: Shawn Cogan 
8/26/22
*/

package Differential;
//import java.util.Scanner;

import java.util.Arrays;

public class Derivatives {

public static void powerFunction(String functionIn, String variable)
{
   String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
   System.out.println(Arrays.stream(num).anyMatch("5"::equals));
   String function = functionIn.replace(variable,"x");
   String pow = function.substring((function.indexOf("x^")+2));
   if (Double.parseDouble(pow)>0){
   double power = Double.parseDouble(pow);
   System.out.println(""+ power);
   }
   //double dpow = power - 1;


   

  // System.out.println("The derivative of function " + functionIn + " with respect to " + variable + " is " + power);

   
}


public static void main(String[] args)
 {
    powerFunction("5t^24", "t");
   
   

 

}
    }