//This class represents an isurance policy for one person
public class Policy
{
//fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double heightInches;
   private double weightPounds;
   private Policyholder holderInfo;
   /**
   Constructor
   This is the no args constructor that intializes all the fields.
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      heightInches = 0.0;
      weightPounds = 0.0;
   }
   /**
   Constructor
   accepts the necessary arguements to fully intialize the object
   @param pNumber
   @param pName
   @param firstname
   @param lastname
   @param age
   @param sStatus
   @param height
   @param weight
   @param pInfo - Policy object
   */
   public Policy(String pNumber, String pName, String firstname, String lastname, int a, String sStatus, double height, double weight, PolicyHolder pInfo)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = firstname;
      lastName = lastname;
      age = a;
      smokingStatus = sStatus;
      heightInches = height;
      weightPounds = weight;
      pInfo = new PolicyHolder(policyInfo);
   
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param pNumber
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }


   /**
   This method allows code outside the class to store a value, these are the setters
   @param pName
   */

   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param firstname
   */

   public void setFirstName(String firstname)
   {
      firstName = firstname;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param lastname
   */

   public void setLastName(String lastname)
   {
      lastName = lastname;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param age
   */

   public void setAge(int a)
   {
      age = a;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param sStatus
   */

   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param height
   */

   public void setHeight(double height)
   {
      heightInches = height;
   }
   /**
   This method allows code outside the class to store a value, these are the setters
   @param weight
   */

   public void setWeight(double weight)
   {
      weightPounds = weight;
   }
   /**
      sets the Policyholder object
      @param policyInfo  
   */
   public void setPolicyInfo(PolicyHolder policyInfo)
   {
      pInfo = new PolicyHolder (policyInfo);
   }
   /**
   These are the getters that return everything back to the demo class
   @return policyNumber
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   /**
   These are the getters that return everything back to the demo class
   @return providerName
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
   These are the getters that return everything back to the demo class
   @return firstName
   */
   public String getFirstName()
   {
      return firstName;
   }
   /**
   These are the getters that return everything back to the demo class
   @return lastName
   */
   public String getLastName()
   {
      return lastName;
   }
   /**
   These are the getters that return everything back to the demo class
   @return age
   */
   public int getAge()
   {
      return age;
   }
   /**
   These are the getters that return everything back to the demo class
   @return smokingStatus
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
   These are the getters that return everything back to the demo class
   @return height
   */
   public double getHeight()
   {
      return heightInches;
   }
   /**
   These are the getters that return everything back to the demo class
   @return weight
   */
   public double getWeight()
   {
      return weightPounds;
   }
   /**
      This method returns a the static field
      @return PolicyHolder
   */
   public PolicyHolder getPolicyInfo()
   {
      return new PolicyHolder(PolicyInformation);
   }
   /**
   This method initializes the bmi of the policyholder
   @return Bmi
   */
   public double getBmi()
   {
      return (weightPounds * 703)/( heightInches * heightInches );
   }
   /**
   This methods has the contions of the poilciyholder that effects the price of the insurace policy
   @return price
   */
   public double getPrice()
   {
      final double baseFee = 600;
      double price = baseFee;
   
      if (age > 50)
      {
         price += 75;
      }
      if (smokingStatus.equalsIgnoreCase("smoker"))
      {
         price += 100;
      }
      if (getBmi() > 35)
      {
         price += ((getBmi() - 35)* 20);
      }
      return price;
   }
   /**
      A string representation of a Policyholder
      @return the string representation of a Policyholder
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +  
             "\nProvider Name: " + providerName +  
             "\nPolicyholder's First Name: " + firstName +  
             "\nPolicyholder's Last Name: " + lastName +  
             "\nPolicyholder's Age: " + age + 
             "\nPolicyholder's Smoking Status: " + smokingStatus + 
             "\nPolicyholder's Height: " + heightInches + " inches" + 
             "\nPolicyholder's Weight: " + weightPounds + " pounds" + 
             "\nPolicyholder's BMI: %.2f\n", getBMI() + 
             "\nPolicy Price: $%.2f\n", getPrice()) ;
   
   }

   
}
