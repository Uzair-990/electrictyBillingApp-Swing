package elecbill;

public class CommercialPlan extends Plans {
	//Commercial will implement the plans interface as it is a plan and implement the method as per its requirement.
	@Override
	public void getRate() {
		rate_per_unit=20.0;
		
	}
}
