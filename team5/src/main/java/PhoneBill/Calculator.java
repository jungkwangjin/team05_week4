package PhoneBill;

public class Calculator {
	double usage;
	int linenumber;
	double exceedUsage;
	String type;
	
	public Calculator(double usage,int linenumber,String type){
		this.usage=usage;
		this.linenumber=linenumber;
		this.exceedUsage=0;
		this.type=type;
	}
	public double calculation(){
		double exceedUsageFee=0;
		double lineNumberFee=0;
		double totalFee=0;
		if(type.equals("Gold")){
			Plan gold = new GoldPlan();
			exceedUsage = usage-gold.getBasicMin();
			if(exceedUsage>0){
				exceedUsageFee=exceedUsage*gold.getExcessFareRate();
			}
			if(linenumber>3){
				lineNumberFee=(linenumber-3)*5+43;
			}
			else if(3>=linenumber){
				lineNumberFee=(linenumber-1)*21.5;
			}
			totalFee=gold.getBasicFee()+exceedUsageFee+lineNumberFee;
			return totalFee;
		}
		if(type.equals("sliver")){
			Plan silver = new SilverPlan();
			exceedUsage = usage-silver.getBasicMin();
			if(exceedUsage>0){
				exceedUsageFee=exceedUsage*silver.getExcessFareRate();
			}
			if(linenumber>3){
				lineNumberFee=(linenumber-3)*5+29;
			}
			else if(3>=linenumber){
				lineNumberFee=(linenumber-1)*14.5;
			}
			totalFee=silver.getBasicFee()+exceedUsageFee+lineNumberFee;
			return totalFee;
		}
		else{
			System.out.println("error");
			return 0;
		}
	}
}