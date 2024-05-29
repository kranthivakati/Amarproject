package basics;

import java.util.Scanner;

public class Withdraw {
	double withdraw;
	public double withdraw() {
		Balance obj=new Balance();
		Scanner sc=new Scanner(System.in);
		System.out.println("please type how much u want to withdraw");
		 withdraw=sc.nextDouble();
		 if(withdraw<=obj.balance) {
		return  withdraw;
	}
		return withdraw;
}
}
