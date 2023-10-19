package elecbill;

public class PlanFactory {
   /*this class method will identify the plan of the user and will help to accordingly initialize the plans object
    * as per the customer's plan.*/
	//this method will return the plan of the consumer.
   public Plans getPlan(String planName) {
	   
			  if(planName==null) {return null;}
		       else if(planName.equalsIgnoreCase("Home Plan")) {
				  return new HomePlan();
			  }
			  else if(planName.equalsIgnoreCase("Commercial Plan")) {
				  return new CommercialPlan();
			  }else if(planName.equalsIgnoreCase("Institutional Plan")) {
				  return new InstitutionalPlan();
			  }else if(planName.equalsIgnoreCase("Farmer Plan")) {
				  return new FarmerPlan();
			  }
			  return null;
		  }

   }

