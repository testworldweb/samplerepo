package com.testworldweb.java.sorting;

import java.util.Arrays;

public class MergeSortFb16 {
	
public static void mergeWithinArray(int[] userArray ,int start ,int mid ,int end){
		
		
		int i=start,
				k=start;
		int j=mid+1;
		
		
			int [] result=new int[userArray.length];
			
			
				while(i<=mid && j<=end){
		
					if(userArray[i]<userArray[j]){
						
						result[k]=userArray[i];
						i++;
						k++;
					}
					
					else{
						
						result[k]=userArray[j];
						j++;
						k++;
					}
					
					
			}
				while(i<=mid){
					result[k]=userArray[i];
					i++;
					k++;
				}
			while(j<=end){
				result[k]=userArray[j];
				j++;
				k++;
			}		
			
				
			for(int x=start;x<=end;x++){
				
				userArray[x]=result[x];
			}
			

		
	

		}

		
		public static void mergeSortArray(int[] userArray){
			
			doMergeSort(userArray,0,userArray.length-1);
				
		}
		
		private static void doMergeSort(int inputArr[],int lowerIndex, int higherIndex) {
    
			    if (lowerIndex < higherIndex) {
			        int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			        // Below step sorts the left side of the array
			        doMergeSort(inputArr,lowerIndex, middle);
			        // Below step sorts the right side of the array
			        doMergeSort(inputArr,middle + 1, higherIndex);
			        // Now merge both sides
			        
			        mergeWithinArray(inputArr,lowerIndex, middle, higherIndex);
			    }
			}
	
			public static void main(String[] args){
				
				int[] numbers1={3,1,1,1,1,1,1,1,100,9,6,2};
				//array
				
				System.out.println(Arrays.toString(numbers1));
				mergeSortArray(numbers1);
				System.out.println(Arrays.toString(numbers1));
					
			}

}