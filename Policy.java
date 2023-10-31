//This class represents an isurance policy for one person
public class Policy
{
//fields
   private double heightInches;
   private double weightPounds;
   private double totalFee;
   private double additionalFee;
   private double bmi;
   /**
   Constructor
   This is the no args constructor that intializes all the fields.
   */
   public Policy()
   {
      heightInches = 0.0;
      weightPounds = 0.0;
      totalFee = 0.0;
      additionalFee = 0.0;
      bmi = 0.0;
   }
   /**
   Constructor
   accepts the necessary arguements to fully intialize the object
   @param height, the height is passed into this method
   @param weight, the weight is passed into the method
   */
   public Policy(int height, int weight)
   {
      baseFeeInsurancePolicy = 600;
      heightInches = height;
      weightPounds = weight;

   }
   /**
   This method allows code outside the class to store a value
   @param height, this is the height in inches passed into the method
   */
   public void setHeightInInches(int height)
   {
      heightInches = height;
   }
   /**
   This method allows code outside the class to store a value
   @param weight, this is the weight in pounds passed into the method

   */
   public void setWeightInPounds(int weight)
   {
      weightPounds = weight;
   }
   /**
   This method initializes the bmi of the policyholder 
   @param weight, this is needed for the equation
   @param height, this is also needed for the equation
   @return bmi, returns the result of the equation
   */
   public int getPolicyholderBmi(int weight, int height)
   {
      bmi = (weight*703)/(height*height);
      return bmi;
   }
   /**
   This methods has the contions of the poilciyholder that effects the price of the insurace policy
   @param bmi, is used to determine the price
   @return totalFee, returns the result of the conditions and their price
   */
   public int priceInsurancePolicy(int bmi)
   {
      totalFee = BaseFeeInsurancePolicy;
      if (age > 50)
      {
         totalFee = totalFee + 75;
      }
      if (smokingStatus.equals("smoker"))
      {
         totalFee = totalFee + 100;
      }
      if (bmi > 35)
      {
         additionFee = (bmi - 35)* 20;
      }
      return totalFee;
   }
   
}   