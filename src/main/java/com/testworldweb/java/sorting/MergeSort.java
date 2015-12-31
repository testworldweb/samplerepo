package com.testworldweb.java.sorting;

public class MergeSort {

	 

	     
	   
	   
	     
	    public static  void  mergesort(int inputArr[]) {
	      
	        doMergeSort(inputArr,0, inputArr.length - 1);
	    }
	 
	    private static void doMergeSort(int inputArr[],int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(inputArr,lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(inputArr,middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(inputArr,lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private static void mergeParts(int inputArr[],int lowerIndex, int middle, int higherIndex) {
	    	  int [] tempMergArr = new int[inputArr.length];
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = inputArr[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	            	inputArr[k] = tempMergArr[i];
	                i++;
	            } else {
	            	inputArr[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	        	inputArr[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	        while (j <= higherIndex) {
	        	inputArr[k] = tempMergArr[j];
	            k++;
	            j++;
	        }
	 
	    }
	
	 public static void main(String a[]){
         
	        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        mergesort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }

}
