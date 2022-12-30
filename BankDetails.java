class BankAccount{
	String accnum;
	String cname;
	Double balance;

	void BankAccount(String acno, String name, Double bal){
	String accnum = acno;
	String cname = name;
	Double balance = bal;
	}
	
	void display(){
	System.out.println("The given account type is Not Mentioned ");
	System.out.println("Account num : "+accnum);
	System.out.println("Account holder name : "+cname);
	System.out.println("Account balance : "+balance);
	}

}

class SavingsAcc extends BankAccount{
	double interest;
	double newBal;
	boolean check;

	double SavingsAcc(String acno, String name, Double bal, double roi,int months){
	super(acno, name, bal);
	newBal =  balance * (Math.pow( (1 + roi), months));
	double interest = newBal-balance;
	check = false;
	}

	void display(){
	System.out.println("The given account type is SAVINGS_ACC");
	System.out.println("Account num : "+accnum);
	System.out.println("Account holder name : "+cname);
	System.out.println("Account balance : "+newBal);
	System.out.println("Interest received : "+interest);
	System.out.println("Checkbook facility : "+check);
	}
}

class CurrentAcc extends BankAccount{
	double interest;
	boolean check;
	double minBal=100;
	double fine = 25;
	
	double CurrentAcc(String acno, String name, Double bal){
	super(acno, name, bal);
	check=true;
	if(bal< minBal)
		balance= balance - fine;
	else
		return balance;

	}

	void display(){
	System.out.println("The given account type is CURRENT_ACC");
	System.out.println("Account num : "+accnum);
	System.out.println("Account holder name : "+cname);
	System.out.println("Account balance : "+balance);
	System.out.println("Interest received : 0.00 ");
	System.out.println("Checkbook facility : "+check);
	}
}

class BankDetails{
	
	public static void main(String args[]){

	BankAccount ac0 = new BankAccount(S0, xyz , 678.55);
	ac0.display();

	SavingsAcc ac1 = new SavingsAcc(S1, manav, 100, 10, 12);
	ac1.display();

	CurrentAcc ac2 = new CurrentAcc(S2, aman, 500);
	ac2.display();

	CurrentAcc ac3 = new CurrentAcc(S3, aman, 50);
	ac3.display();

	}

}

	