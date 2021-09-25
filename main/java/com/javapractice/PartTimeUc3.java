package com.javapractice;

public class PartTimeUc3
{
	public static void main(String[] args)
	{
		int Is_Part_Time = 1;
		int Is_Full_Time = 2;
		int Full_Day_Hours = 20;
		int EmpWage = 0;
		int Wage_Per_Hour = 0;
		double empCheck = Math.floor(Math.random()*10) % 3;
		if (empCheck == Is_Full_Time)
			 Wage_Per_Hour = 8;
		else if (empCheck == Is_Part_Time)
			 Wage_Per_Hour = 4;
		else
			 Wage_Per_Hour = 0;
		EmpWage = Wage_Per_Hour * Full_Day_Hours;
		System.out.println("Employee Wage:" + EmpWage);
	}

}
