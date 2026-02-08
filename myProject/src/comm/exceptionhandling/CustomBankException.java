package comm.exceptionhandling;
import java.util.Scanner;
import com.applications.BankApplication;

public class CustomBankException {
	static int accno;
	static String holderName;
	static int pin ;
	static int balance;

	public CustomBankException(int accno, String holderName,int pin, int balance) {
		this.accno = accno;
		this.holderName = holderName;
		this.pin = pin;
		this.balance = balance;
	}

	

	static void Deposit(int amount) throws NegativeBalanceException {
		if (amount <= 0) {
			throw new NegativeBalanceException("You have Negative balaance ");
		} else {
			amount = amount + balance;
			System.out.println("Balance after deposit : " + amount);
		}
	}

	static void withdraw(int amount, int balance) throws InsufficientBalaceException {
		try {
			if (amount > balance) {
				throw new InsufficientBalaceException(" Insufficient balance ");
			} else if (amount <= balance) {
				amount = balance-amount;
				System.out.println("Remaining Balance after withdraw : " + amount);
			}
		} catch (InsufficientBalaceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void pinCheck(int pin1) throws InvalidPINException {
		if (pin1==pin) {
			throw new InvalidPINException("You are entered wrong pin");
		} else {
			System.out.println("You entered Correct pin!");
		}

	}

	static void display() {
		System.out.println("Account No : " + accno);
		System.out.println("Account Holder Name : " + holderName);
		System.out.println("PIN : " + pin);
		System.out.println("Balance in ur account : " + balance);
	}

	public static void main(String[] args) throws InvalidPINException {
		Scanner sc = new Scanner(System.in);
		CustomBankException c = new CustomBankException(1, "abc", 1234, 5000);
		// System.out.println("Enter your pin ");
//		Object curUser = c;
//		while (curUser != null) {
		System.out.print("Enter PIN: ");
		int pin1 = sc.nextInt();
		if (pin1==pin) {
			System.out.println("PIN Matched ");
			display();

		} else {
				throw new InvalidPINException("Invalid PIN enter correct PIN ");
		}
		System.out.println("Enter ur choice :");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter Amount to deposit ");
			int amount;
			try {
				amount = sc.nextInt();
				Deposit(amount);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		}
		case 2: {
			System.out.println("Enter Amount to withdraw ");

			try {
				int amount = sc.nextInt();
				withdraw(amount, c.balance);
			} catch (InsufficientBalaceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}

	}

}
