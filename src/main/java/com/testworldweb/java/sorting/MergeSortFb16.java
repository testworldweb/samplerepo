package com.testworldweb.java.sorting;

public class MergeSortFb16 {
	
public static void mergeWithinArray(int[] userArray ,int start ,int mid ,int end){
		
		
		int i=0,k=0;
		int j=mid+1;
		int temp=0;
		
		
			int [] result=new int[userArray.length];
			
			
				while(i<=mid && j<userArray.length){
		
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
			
			while(j<userArray.length){
				result[k]=userArray[j];
				j++;
				k++;
			}		
			
			System.out.println("");
			System.out.print("The merged array is : ");
			
			for(int x=0;x<result.length;x++){
				
				System.out.print(" "+result[x]+ " ");
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
				
				int[] numbers1={1,50,200,3,5,7,9,2,14,16,18,100};
				
				mergeSortArray(numbers1);
					
			}

}
