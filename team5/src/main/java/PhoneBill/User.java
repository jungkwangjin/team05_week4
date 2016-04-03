package PhoneBill;
import java.util.Scanner;

public class User {
	private String plan;
	private int numsub;
	private double usage;
	
	User(String type, int subnums, double usages ){
		this.plan = type;
		this.numsub = subnums;
		this.usage = usages;
	}

	public void printbill(){
		Bill bill = new Bill(plan, numsub, usage);
		bill.print();
	}
	
	public static void main(String[] args){
		String plan;
		int numsub;
		double usage;
		Scanner scanner = new Scanner(System.in);
		System.out.println("플랜을 입력하세요.");
		plan = scanner.next();
		System.out.println("연결된 계정수를 입력하세요.");
		numsub = scanner.nextInt();
		System.out.println("사용량을 입력하세요");
		usage = scanner.nextDouble();
		User user = new User(plan,numsub,usage);
		user.printbill();
	}

}
