import java.util.*;
import java.io.*;
import java.util.ArrayList;

/**
This is an instance of the Policy class
*/

public class DemoForPolicy
{
   public static void main (String[]args)
   {
      try 
      {
         File file = new File ("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
      
      // Declare the variables
         String policyNumber;
         String providerName;
         String firstName;
         String lastName;
         String smokingStatus;
         double height;
         double weight;
         int age; 
       
         ArrayList<Policy>policies = new ArrayList<Policy>();  
      
         while (inputFile.hasNext())
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine(); 
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = Integer.parseInt(inputFile.nextLine());
            smokingStatus = inputFile.nextLine();
            height = Double.parseDouble(inputFile.nextLine());  
            weight = Double.parseDouble(inputFile.nextLine());  
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
         //Creating an object of the Policy class and passing the arguments to the constructor
            Policy test = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(test);
         }
         inputFile.close();
      
         for (int i = 0; i < policies.size(); i++)
         {
         
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
            System.out.println("Policyholder's BMI: " + policies.get(i).getBmi());
            System.out.printf("Policy Price: %,.2f\n", policies.get(i).getPrice());
            System.out.println();
            
         }
         int smokerCount = 0;
         int nonsmokerCount = 0;
         for (Policy policy : policies) 
         {
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) 
            {
               smokerCount++;
            } 
            else 
            {
               nonsmokerCount++;
            }
         }
            
         System.out.println("The number of policies with a smoker is; " + smokerCount);
         System.out.println("The number of policies with a non-smoker is; " + nonsmokerCount);
      }
      
      catch (IOException ex)
      {
         System.out.println("Something went wrong reading this file: " +ex.getMessage());
      }
   }
}
