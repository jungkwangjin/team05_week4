package PhoneBill;

public class GoldPlan implements Plan {
	private double basicmin = 1000;
	private double excessfarerate = 0.45;
	private double basicfee = 49.95;
	
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
