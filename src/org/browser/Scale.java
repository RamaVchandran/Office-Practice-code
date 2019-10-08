package org.browser;

import java.util.Scanner;

public class Scale {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Eneter the value");
		int v =(10*scr.nextInt());
		
		for (int i = 0; i <= v; i++) {
			
			
			if (i%10==0){
				System.out.print("|");
				System.out.print(i/10);
				
			}else if (i%5==0){
				System.out.print('!');
			}else{
				System.out.print('-');
			}
			
		}
	}

}
