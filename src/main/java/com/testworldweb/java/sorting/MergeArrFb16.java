package com.testworldweb.java.sorting;

public class MergeArrFb16 {
	

	

		public static void main(String[] args){
			
			int[] numbers1={1,3,5,7,9};
			int[] numbers2={2,4,6,8,10,11,12,13,14,15};
			mergeArrays(numbers1,numbers2);
				
		}
		
		public static void mergeArrays(int[] array1, int[] array2){
			
			int [] result=new int[array1.length+array2.length];
			
			int i=0,j=0,k=0;
			
				while(i<array1.length && j<array2.length){
		
					if(array1[i]<array2[j]){
						
						result[k]=array1[i];
						i++;
						k++;
					}
					
					else{
						
						result[k]=array2[j];
						j++;
						k++;
					}
					
					
			}
			
			while(j<array2.length){
				result[array1.length-1+i]=array2[j];
				j++;
				i++;
			}		
			
			
			System.out.print("The merged array is : ");
			
			for(int x=0;x<result.length;x++){
				
				System.out.print(" "+result[x]+ " ");
			}
			

		
	}


}
