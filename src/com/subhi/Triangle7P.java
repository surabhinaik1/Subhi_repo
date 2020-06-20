package com.subhi;

import java.util.Scanner;

public class Triangle7P {

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value");
		int n =sc.nextInt();
		int count =1;
		
		for(int i=0;i<n;i++){
			
			for(int sp=n-i;sp>0;sp--){
				System.out.print(" ");
			}
			
			for(int j=0;j<count;j++){
				
				System.out.print("*");
				
			}
			count =count+2;
			System.out.println();
		}
	}

}
