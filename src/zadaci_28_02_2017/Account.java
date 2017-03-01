package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
		dateCreated = new Date();
		
	}
	Account(int id,double balance){
		this.id=id;
		this.balance=balance;
		
	}
	public int getID(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setID(int id){
		this.id=id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public Date getDate(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	double getMonthlyInterest(){
		return balance*((annualInterestRate/12)/100);
	}
	public void withdraw(double withdraw){
		balance-=withdraw;
	}
	public void deposit(double deposit){
		balance+=deposit;
	}

}
