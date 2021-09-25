package com.javapractice;

public class SwitchUc4 
{
	public static void main(String[] args)
	{
		int Wage_Per_Hour = 20;
		int Work_Hours;
		double empCheck = Math.floor(Math.random()*10) % 3;
		int i = (int) empCheck;
		switch(i)
		{
		case 1:
			Work_Hours = 8;
			break;
		case 2:
			Work_Hours = 4;
			break;
		default:
			Work_Hours = 0;
		}
		int EmpWage = Work_Hours * Wage_Per_Hour;
		System.out.println("Employee Wage:" + EmpWage);
	}

}
