package com.SavingAcc;

public class BankAccListTest {

	public static void main(String[] args) {
		BankAccountList bankAcccList= new BankAccountList();
		SavingAccount savAcc0=new SavingAccount(1_00_000, 102, "Anindya", true);
		bankAcccList.addAccount(savAcc0);
		
		SavingAccount savAcc1=new SavingAccount(2_00_000, 103, "Drishti", false);
		bankAcccList.addAccount(savAcc1);
		
		
		SavingAccount savAcc2=new SavingAccount(3_00_000, 100, "Mahek", true);
		bankAcccList.addAccount(savAcc2);
		
		SavingAccount savAcc3=new SavingAccount(4_00_000, 104, "Nishad", false);
		bankAcccList.addAccount(savAcc3);
			
		SavingAccount savAcc4=new SavingAccount(5_00_000, 101, "Sayali", true);
		bankAcccList.addAccount(savAcc4);
		
		
		
		bankAcccList.set.stream().forEach(System.out::println);
		
		System.out.println("*******************************************************************************");
		
		bankAcccList.removeAccount(savAcc3);
		System.out.println("After removing one account");
		
		bankAcccList.set.stream().forEach(System.out::println);
		
		
	}

}
