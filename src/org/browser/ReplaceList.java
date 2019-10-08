package org.browser;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceList {

	public static void main(String[] args) {
		
		        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "100", "200", "300","400","500","600","700") );
		         
		        System.out.println(namesList);
		         
		        //Replace item while iterating
		        for(int i=0; i < namesList.size(); i++)
		        {
		            if(namesList.get(i).equalsIgnoreCase("300")) {
		                namesList.set(i, "350");
		            }
		        }
		         
		        System.out.println(namesList);
		    }

	}


