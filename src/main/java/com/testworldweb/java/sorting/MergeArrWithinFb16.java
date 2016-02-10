package com.testworldweb.java.sorting;

public class MergeArrWithinFb16 {
	
	
	
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
			
			
			System.out.print("The merged array is : ");
			
			for(int x=0;x<result.length;x++){
				
				System.out.print(" "+result[x]+ " ");
			}
			

		
	

		}
		
	
			public static void main(String[] args){
				
				int[] numbers1={1,3,5,7,9,2,14,16,18,100};
				
				mergeWithinArray(numbers1,0,4,9);
					
			}
		}
		

