package basics;
import java.util.Scanner;
public class Demo {
	 static String pin ="1234";
	public static void main(String[] args) {
		System.out.println("HEY WELCOME TO HDFC ATM ");
		System.out.println("NOW CAN DO ");
		System.out.println("1.CHECK BALANCE ");
		System.out.println("2.WITHDRAW");
		System.out.println("3.CHANGE PIN");
		System.out.println("PLEASE CHOOSE BETWEEN 1 TO 3 ");
		try (Scanner scan = new Scanner(System.in)) {
			int varible =scan.nextInt();
			if(varible==1) {
				System.out.println("checking your  bank balance please wait ");
				Pin obj=new Pin();
				if(obj.pin()) {
					Balance obj1=new Balance();
					System.out.println(obj1.balance);
				}else  {
					System.out.println("sorry your upi pin is wrong please try again");
				}
			}
			 if (varible==2) {
				System.out.println("withdrawing please wait ");
				Pin obj=new Pin();
				if(obj.pin()) {
					Withdraw with=new Withdraw();
					System.out.println( "your withdrawing "+with.withdraw()+" rupees");
					Balance obj1=new Balance();
				    double totalbalance=obj1.balance-with.withdraw;
				    if(totalbalance<0) {
				    System.out.println("you entered more amount then your balance ");
				    }else if (totalbalance>0) {
				    	System.out.println("total balance in your account :"+totalbalance);
					}
				}else  {
					System.out.println("sorry your upi pin is wrong please try again");
				}
			}	
			  if (varible==3) {
				System.out.println("please wait");
				Pin obj=new Pin();
				//obj.pinchange();
				System.out.println("new pin please don't share to others"+obj.pinchange());
			}
		} 
	}
}
	



