//This class represents an isurance policy for one person and has information pertaining to the policyholder
public class PolicyHolder
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
   */
   public Policy(String pNumber, String pName, String firstname, String lastname, int a, String sStatus, double height, double weight)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = firstname;
      lastName = lastname;
      age = a;
      smokingStatus = sStatus;
      heightInches = height;
      weightPounds = weight;
   
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
