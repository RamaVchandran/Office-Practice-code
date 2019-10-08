package org.browser;

public class Duplicatearray {

	public static int removedup(int a[],int n) {
		if (n==1||n==0)
			return n;
		

	int[] temp = new int[n];
    int j = 0;
    for (int i=0; i<n-1; i++)
        if (a[i] != a[i+1])
            temp[j++] = a[i];
     
    temp[j++] = a[n-1];   
     
    // Changing original array
    for (int i=0; i<j; i++)
        a[i] = temp[i];
  
    return j;
		}
 
public static void main (String[] args) {
    int arr[] = {10,20,20,30,30,40,50,50};
    int length = arr.length;
     
    length = removedup(arr, length);
    //printing array elements
    for (int i=0; i<length; i++)
       System.out.print(arr[i]+" ");
}

}
