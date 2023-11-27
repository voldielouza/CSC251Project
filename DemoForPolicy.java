import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.io.IOExecption;

/**
This is an instance of the Policy class
*/

public class DemoForPolicy
{
   public static void main (String[]args) throws IOExeption
   {
     
      // Declare the variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      String smokingStatus;
      double height;
      double weight;
      int age; 
   			 
       //ArrayList to store Policy Objects 
      ArrayList<Policy>policies = new ArrayList<Policy>(); 
   
   		//Create and open file
      File file = new File ("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file); 
      
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine(); 
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nexDouble();  
         weight = inputFile.nextDouble();  
            
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         //Creating an object of the Policy class and passing the arguments to the constructor
         policies.add(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
      }
      
      
      for (Policy policy : Policies)
      {
         
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
         System.out.println();
      }
      int smokerCount = 0;
      
      if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) 
      {
         smokerCount++;
      } 
            
      System.out.println("The number of policies with a smoker is; " + smokerCount);
      System.out.println("The number of policies with a non-smoker is; " + (policies.size()-smokerCount));
   }
      
}

