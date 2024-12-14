//insert scanner
import java.util.Scanner;

public class Project5
{
         
        public static void main (String [] args)
    {
        Scanner kb = new Scanner(System.in);
        boolean continueCalculator = true;
        while(continueCalculator)
        {
            //prompt user input for calculation 
            System.out.println("Welcome to the Java Calculator");
            System.out.println("Enter an operation(+,-,/,*, or exit");
            String operation = kb.next();

            if(operation.equals("exit"))
            {
                continueCalculator=false;
                System.out.println("Exiting the Java Calculator.Bye!");
                break;
            }
            
            //get user to imput for numbers
            System.out.println("Enter the first number:");
            double number1 = kb.nextDouble();
            System.out.println("Enter the second number:"); 
            double number2 = kb.nextDouble();
            double result =0;
            boolean validOperation = true;
            switch(operation)
            {
                //Perform calculation and insert breaks
                case "+":
                result = number1 + number2;
                break;
                case"-":
                result = number1 - number2;
                break;
                case "*":
                result = number1 * number2;
                break;
                case "/":
                    //imput validation and dont allow for division by zero
                if (number2 !=0)
                    {
                        result =number1/number2;
                    }
                    else 
                    {
                        System.out.println("Error: Division by zero is not allowed");
                        validOperation=false;
                    }
                    break;
                default:
                System.out.println("Invalid option.");
                validOperation=false;
                break;
            }
            //display the results 
                if (validOperation)
                {
                    System.out.println("The result is " + result);
                }
                //loop
                System.out.println("Would you like to perform another operation (yes/no)?");
                String userChoice=kb.next();
                if(!userChoice.equalsIgnoreCase("yes"))
                {
                    continueCalculator=false;
                    System.out.println("Thank you for using the java Calculator! Goodbye!");
                }

        }
        //close scanner

        kb.close();
    }   
}

