package com.SavingAcc;

public class SavingAccount implements Comparable<SavingAccount>{
	private double acc_balance;
	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAccount;
	private static final double MINBAL=10000;
	
	
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acc_ID;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acc_ID != other.acc_ID)
			return false;
		return true;
	}





	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}





	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	
	public void withdraw(float money)
	{
		
		if(isSalaryAccount)
		{
			if((getAcc_balance()-money)>=0)
			{
				setAcc_balance(getAcc_balance()-money);
			}
			else
			{
				System.out.println("withdrwal money cannot be more than acc balance ");
			}
		}
		else
		{
			if((getAcc_balance()-money)>=MINBAL)
			{
				setAcc_balance(getAcc_balance()-money);
			}
			else
			{
				System.out.println("withdrwal money less than MINBAL is not allowed ");
			}
		}
		
		
	}
	
	public void deposite(float money)
	{
		acc_balance+=money;
	}





	@Override
	public int compareTo(SavingAccount savAcc) {
		
		return this.acc_ID-savAcc.getAcc_ID();
	}
	
}
