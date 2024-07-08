package com.webapi.APIcrud;

public class Arrays {
	public static void main(String[] args) {
		
		int[]arr= {3,6,9,4};
		for(int num:arr) {
			System.out.println(num+ " ");
		}
	}
	public static void bubbleSort(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-1;j++) {
				if(arr[j]>arr[j+1] ){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
