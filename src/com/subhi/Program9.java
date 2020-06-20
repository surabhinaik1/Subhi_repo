package com.subhi;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
			int n = 6;
			int count =1;
			
			for(int i=0;i<n;i++){
				
				for(int sp=n-i;sp>0;sp--){
					System.out.print(" ");
				}
				
				for(int j=0;j<count;j++){
					
					System.out.print(i+1);
					
				}
				count =count+2;
				System.out.println();
			}
		}
}
