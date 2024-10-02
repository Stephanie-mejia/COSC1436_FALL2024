//Create a new Java class named BudgetCalculator
public class BudgetCalculatorProject
{
public static void main (String [] args)
{
   //Define Constants
   final double SALARY =3000.0;
   final double SAVINGS_PERCENTS =0.20;
   final double RENT_PERCENT =0.30;
   final double GROCERIES_PERCENT =0.15;
   final double ENERTAINMENT_PERCENT=0.10;

   //Declare Variables
   double monthlySalary=SALARY;
   double savedAmount;
   double rentAmount;
   double groceriesAmount;
   double entertainmentAmount;
   double totalExpenses;
   double remainingBalance;

   //Perform Calculations
   savedAmount=monthlySalary*SAVINGS_PERCENTS;
   rentAmount=monthlySalary*RENT_PERCENT;
   groceriesAmount=monthlySalary*GROCERIES_PERCENT;
   entertainmentAmount=monthlySalary*ENERTAINMENT_PERCENT;
   totalExpenses=rentAmount+groceriesAmount+entertainmentAmount;
   remainingBalance=monthlySalary-totalExpenses;

   //Display Results
   System.out.println("Monthly salary:$"+monthlySalary);
   System.out.println("Amount saved:$"+savedAmount);
   System.out.println("Amount spent on rent:$"+rentAmount);
   System.out.println("Amount spent on groceries:$"+groceriesAmount);
   System.out.println("Amount spent of entertainment:$"+entertainmentAmount);
   System.out.println("Total expenses:$"+totalExpenses);
   System.out.println("Remaining balance:$"+remainingBalance);

}

}
/** When the constants are changed for example Monthly salary from 3000.0 to 4000.0 and the Amount saved from .20 to .10 
    the displayed results change for every category because when you are calculating you are multiplying by monthlySalary
    which directly impacts every result*/