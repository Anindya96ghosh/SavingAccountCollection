package com.SavingAcc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static ArrayList<SavingAccount> list=new ArrayList<>();
	public static void main(String[] args) {
		SavingAccount sa[]=new SavingAccount[5];

		sa[0]=new SavingAccount(1_00_000, 101, "Anindya", true);
		sa[1]=new SavingAccount(2_00_000, 102, "Drishti", false);
		sa[2]=new SavingAccount(3_00_000, 103, "Mahek", true);
		sa[3]=new SavingAccount(4_00_000, 104, "Nishad", false);
		sa[4]=new SavingAccount(5_00_000, 105, "Sayali", true);
		
		
		for(int i=0;i<5;i++)
		{
			list.add(sa[i]);
		}
		
		for(SavingAccount ans:list)
		{
			System.out.println(ans);
		}


	}
	
//	public void save(String fileName)
//	{
//		
//		String tmp=list.toString();
//		PrintWriter pw= new PrintWriter(new FileOutputStream(FileName));
//		pw.write(tmp);
//		pw.close();
//		
//	}
//
//	public void load(String fileName) throws FileNotFoundException
//	{
//		FileInputStream fileIn= new FileInputStream(fileName);
//		Scanner scan= new Scanner(fileIn);
//		String loadedClubs = scan.next();
//		list.add(loadedClubs);
//	}

}