package com.javapractice;

public class EmpWageUc2
{
	public static void main(String[] args) 
	{
		int Is_Full_Time = 1;
		int Wage_Per_Hour = 20;
		int Full_Day_Hours = 0;
		int EmpWage = 0;
		double empCheck = Math.floor(Math.random()*10) % 2;
		if (empCheck == Is_Full_Time)
	        Full_Day_Hours = 8;
		else
			Full_Day_Hours = 0;
		EmpWage = Wage_Per_Hour * Full_Day_Hours;
		System.out.println("Employee Wage:" + EmpWage);
	}

}
