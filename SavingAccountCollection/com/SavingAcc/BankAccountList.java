package com.SavingAcc;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList  {


	Set<SavingAccount> set=new TreeSet<>();
	
	public void addAccount(SavingAccount savAcc)
	{
		if(savAcc.getAccountHolderName() !=null)
		{
			set.add(savAcc);
		}
	}
	
	public void removeAccount(SavingAccount savAcc)
	{
		set.remove(savAcc);
	}
}
	
//		
//		sa[0]=new SavingAccount(1_00_000, 101, "Anindya", true);
//		sa[1]=new SavingAccount(2_00_000, 102, "Drishti", false);
//		sa[2]=new SavingAccount(3_00_000, 103, "Mahek", true);
//		sa[3]=new SavingAccount(4_00_000, 104, "Nishad", false);
//		sa[4]=new SavingAccount(5_00_000, 105, "Sayali", true);
//		
//		
//		
//		for(int i=0;i<5;i++)
//		{
//			set.add(sa[i]);
//		}
//
//		set.stream().forEach(System.out::println);
//		
//		
//		
//	}
////	public int compareTo(SavingAccount arg0) {
////		
////		return 0;
////	}
//	@Override
//	public int compareTo(Object arg0) {
//		
//		return ;
//	}


