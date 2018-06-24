package com.mycompany.app.sortingalgos;

import java.util.Scanner;

public class MergeSort
{
	   void merge(int array[], int low, int middle, int high)
	    {
	        // this will find sizes of two subarrays to be merged
	        int n1 = middle - low + 1;
	        int n2 = high - middle;
	 
	        // this creates temp arrays //
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	 
	        //this copies data to temp arrays//
	        for (int i=0; i<n1; ++i)
	            L[i] = array[low + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = array[middle + 1+ j];
	 
	 
	        /* this will merge the temp arrays */
	 
	        //this will initiates indexes of first and second subarrays
	        int i = 0, j = 0;
	 
	        // this initializes index of merged subarray
	        int k = low;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                array[k] = L[i];
	                i++;
	            }
	            else
	            {
	                array[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        // this copies remaining elements of L[] if any //
	        while (i < n1)
	        {
	            array[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* this will copy remaining elements of R[] if any */
	        while (j < n2)
	        {
	            array[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	    
	    void sort(int array[], int low, int high)
	    {
	        if (low < high)
	        {
	            // this will find the middle point
	            int middle = (low+high)/2;
	 
	            // this will sort first and second parts
	            sort(array, low, middle);
	            sort(array , middle+1, high);
	 
	            // this will merge the parts
	            merge(array, low, middle, high);
	        }
	    }
   
    void display(int array[])
	{
		System.out.println("The sorted array is:");
		for(int element:array)
		{
			System.out.print(element+" ");
		}
	}
 
    public static void main(String args[])
    {
    	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int no_of_elements=scan.nextInt();
		int array[]=new int[no_of_elements];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<no_of_elements;i++)//here i is index
		{
			array[i]=scan.nextInt();
		}
		//creates object
		MergeSort object=new MergeSort();
		//sorts the elements
		object.sort(array,0,no_of_elements-1);
		//displays the elements
		object.display(array);
        
    }
}
