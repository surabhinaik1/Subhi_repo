package com.subhi;

public class ReverseStringProgram3 {

	public static void main(String[] args) {
		
		//input from user
		
		/*
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str = sc.next();// allowing only word not statement.
		sc.close();
		String revstr ="";
		
		for(int i =str.length()-1; i>=0; i--){
			revstr= revstr + str.charAt(i);
			//charAt method returns the character value at the specified index 
		}
		*/
		
		// input from program
		String str = "Surabhi Sunil Naik";
		String revstr ="";
		for(int i =str.length()-1; i>=0; i--){
			revstr= revstr + str.charAt(i);
			//charAt method returns the character value at the specified index 
		}
				
		System.out.println("Reverse String is: ");
		System.out.println(revstr);
	}

}

