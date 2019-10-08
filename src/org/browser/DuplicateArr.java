package org.browser;

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;


public class DuplicateArr {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the size of the array that is to be created::");
		      int size = sc.nextInt();
		      int[] myArray = new int[size];
		      System.out.println("Enter the elements of the array ::");
		      for(int i=0; i<size; i++) {
		         myArray[i] = sc.nextInt();
		      }
		      System.out.println("The array created is ::"+Arrays.toString(myArray));
		      for(int i=0; i<myArray.length-1; i++) {
		         for (int j=i+1; j<myArray.length; j++) {
		            if(myArray[i] == myArray[j]) {
		               myArray = ArrayUtils.remove(myArray, j);
		            }
		         }
		      }
		      System.out.println("Array after removing elements ::"+Arrays.toString(myArray));
		   }
		

	}


