package day_20;

import java.util.Scanner;

/*
 * Wap to create application for Student mgt system
 1) create student class having fields like rollno, name, address
2) create a method getdata method to take input from user
3) create display method

create another class SMS that is having main method and reading and writing method

in main create menu driven application
1) read data
2 write data

as per user choice call appropriate method
in reading method read data from file
in writing method write data to file
 */
//Serialzable is an marker interface
//marker interface are empty interface 
//by inheriting Serializable we are making student class object as persistent 
//by making it persistent now that class object data can be sent to file or network 

import java.io.*;

public class Student implements Serializable
{

	int rollno ;
	String name;
	String address;
	void get()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter rollno name and address");
		rollno= s.nextInt();
		System.out.println("eneter name");
		name= s.next();
		System.out.println("eneter address");
		address= s.next();
	}
	
	void display()
	{
		System.out.println(rollno +"  "+ name+"   "+ address);
	}
}
