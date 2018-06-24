package com.mycompany.app.sortingalgos;

import java.util.Scanner;

public class QuickSort
{
    /* This will take last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller  to left of pivot and all greater elements to right
       of pivot */
    int partition(int array[], int low, int high)
    {
        int pivot = array[high]; 
        int i = (low-1); // this is index of smaller element
        for (int j=low; j<high; j++)
        {
            
            if (array[j] <= pivot)
            {
                i++;
 
                // this will swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
 
        // this will swap array[i+1] and array[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
 
        return i+1;
    }
 
 
    
     
    void sort(int array[], int low, int high)
    {
        if (low < high)
        {
            /* Here pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(array, low, high);
 
            //this sorts the arrays
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }
 
    //prints the elements in the array
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
		System.out.println("Enter the number of elements in the array:");
		int no_of_elements=scan.nextInt();
		int array[]=new int[no_of_elements];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<no_of_elements;i++)//here i is index
		{
			array[i]=scan.nextInt();
		}
		QuickSort object=new QuickSort();
		object.sort(array,0,no_of_elements-1);
		object.display(array);
    }
}