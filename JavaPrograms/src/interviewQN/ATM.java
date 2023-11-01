package interviewQN;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please click the transaction");
		System.out.println("1. Withdraw");
		System.out.println("2. Balance");
		System.out.println("3. Mini statement");
		
		Scanner obj = new Scanner(System.in);
		String act = obj.nextLine();
		System.out.println("Selected Act = "+act);
		
		if (act.equals("1. Withdraw")) {
			System.out.println("Enter the ampunt");
			int amt = obj.nextInt();
			System.out.println("Entered amount"+amt);
			if (amt<200) {
				System.out.println("please enter the amount 200 or more");
			}
			
			else {
				if (amt%200!=0) {
					System.out.println("Please enter the amount that can be divided by 200");
				}
				else {
					System.out.println("200 rupee notes : "+amt/200);
				}
			}
		}
		else {
			System.out.println("Thsi option not available right now");
			System.out.println("Sorry for the incovenience");
		}
		obj.close();
	}

}
