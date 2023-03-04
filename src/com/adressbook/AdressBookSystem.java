package com.adressbook;

import java.util.Scanner;

public class AdressBookSystem {

	public static void main(String[] args) {
		
		System.out.println("welcome to adress book");
		
		add();

	}
	 static void add(){
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter First Name :");
	        String name=sc.nextLine();

	        System.out.println("Enter Last Name :");
	        String last_n=sc.nextLine();

	        System.out.println("Enter City :");
	        String city = sc.nextLine();

	        System.out.println("Enter Number :");
	        String number = sc.nextLine();

	        System.out.println("Enter email :");
	        String email=sc.nextLine();

	        contact Contact = new contact(name, last_n, city, number, email);
	        System.out.println("Contact Added Successfully...");

	    }


}
class contact{
	
	private String name;
	private String last_N;
	private String city;
	private String number;
	private String email;
	
	public contact(String name,String last_N,String city,String number,String email) {
		
		this.name=name;
		this.last_N=last_N;
		this.city=city;
		this.number=number;
		this.email=email;
		
	}
	
	
	
	
}
