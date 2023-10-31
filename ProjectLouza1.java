import java.util.Scanner;

/**
This is an instance of the Policy class
*/

public class ProjectLouza1
{
   public static void main (String[]args)
   {
      // Initialize the varibales
      String policyNumber, providerName, firstname, lastname, status;
      double height, weight, bmi;
      int age; 
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = input.nextLine();
   
      System.out.print("Please enter the Policyholder's First Name: ");
      firstname = input.nextLine();
   
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastname = input.nextLine();
   
      System.out.print("Please enter the Policyholder's Age: ");
      age = input.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/nonsmoker): ");
      status = input.nextLine();
   
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = input.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (In pounds): ");
      weight = input.nextDouble();
      
      //Creating an instance of the Policy class and passing the arguments to the constructor
      Policy test = new Policy(age, height, weight);
      
      System.out.println();
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstname);
      System.out.println("Policyholder's Last Name: " + lastname);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status: " + status);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.println("Policyholder's BMI: " + test.getPolicyHolderBmi());
      System.out.println("Policy Price: %,.2f\n", test.priceInsurancePolicy());
   }


}
