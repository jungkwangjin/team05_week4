package PhoneBill;

public class Bill {
	private String plan;
	private int numsub;
	private double usage;
	
	Bill(String type, int numsubs, double usages){
		this.plan = type;
		this.numsub = numsubs;
		this.usage = usages;
	}
	
	public void print(){
		Calculator calculator = new Calculator(usage, numsub, plan);
		System.out.println("총 금액 : "+calculator.calculation());
	}

}
