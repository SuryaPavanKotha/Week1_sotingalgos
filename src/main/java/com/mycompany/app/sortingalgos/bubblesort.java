package com.mycompany.app.sortingalgos;

public class bubblesort {
public static void main(String[] args) {
	int arr[]={2,5,1,4,3,9};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("sorted array");
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
}
}
