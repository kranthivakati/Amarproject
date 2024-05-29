package basics;

import java.util.Scanner;

public class Pin {
	String pin="1234";
	String newpin;
	public boolean pin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please type your pin");
		String dummy=sc.next();
		if(dummy.equals(pin)) {
			return true;
		}else {
			return false;
		}	
	}
	public String pinchange() {
		Scanner oj=new Scanner(System.in);
		System.out.println("please type 4 digit pin now ");
		newpin=oj.nextLine();
		pin=pin.replace(pin, newpin);
		return pin;
		
		
	}
	

}
