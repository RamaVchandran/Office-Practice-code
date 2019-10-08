package org.browser;

public class Array {
	
	public static void main(String[] args) {
		int a [] = { 100,60,50,60,100,80,90,30};
	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(  a[i] ==  a[j]){
					System.out.println(a[i]);
				}
				
			}
			
		}
				
	
		
		
	}

}
