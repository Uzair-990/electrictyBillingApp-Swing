package elecbill;

public abstract class Plans {
	/*as per the factory model we use a abstract class or an interface which gets initialized in runtime as per the usecase.*/
    //all the plans will have rate per unit different as per the plan type.
	protected double rate_per_unit;
    //all plans using this will set the rate per unit value.
    public abstract void getRate();
    //based on rate per unit value and the consumed units this will tell the billing amount of the customer as per the plane.
    public int calculateBill(int consumedUnits) {
    	System.out.println("BILLING AMOUNT: "+(rate_per_unit*consumedUnits));
    	return (int)rate_per_unit*consumedUnits;
    }
}
