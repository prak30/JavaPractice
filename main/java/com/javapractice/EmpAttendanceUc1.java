package com.javapractice;

public class EmpAttendanceUc1 
{
	public static void main(String[] args)
	{
		int Is_Full_Time = 1;
		double empCheck = Math.floor(Math.random()*10) % 2;
		if (empCheck == Is_Full_Time)
			System.out.println("Employee Is Present");
		else
			System.out.println("employee Is Absent");
	}

}
