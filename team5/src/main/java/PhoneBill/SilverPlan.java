package PhoneBill;

public class SilverPlan implements Plan {
	private double basicmin = 500;
	private double excessfarerate = 0.54;
	private double basicfee = 29.95;
	
	public double getBasicMin(){
		return basicmin;
	}
	public double getExcessFareRate(){
		return excessfarerate;
	}
	public double getBasicFee(){
		return basicfee;
	}



}
