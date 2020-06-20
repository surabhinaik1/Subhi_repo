package com.subhi;

public class Program11 {
	public static void main(String[] args) {
		int n = 5;
				
		for(int i=0;i<=n;i++){
			
			for(int sp=n-i;sp>0;sp--){
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++){
				
				System.out.print(i+"");
				
			}
			
			System.out.println();
		}
	}

}
