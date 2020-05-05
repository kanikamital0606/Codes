//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Target Sum Subsets
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which
// sum to "tar".
// Use sample input and output to get more idea.
//							Sample Input
// 										5 
//										{10 20 30 40 50}
//							Target : 	60
//							Sample Output :  
//										10, 20, 30, .
//										10, 50, .
//										20, 40, .

import java.io.*;
import java.util.*;

public class target_Sum_subset{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = scn.nextInt();
		}

		int target =scn.nextInt();
		printTargetSumSubsets(arr, 0, "", 0, target);
        System.out.println(); 
	}
	// set is the subset
    // sos is sum of subset
    // tar is target
    //int idx = which element to be seen 

    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar){

    	//base case
    	if(idx == arr.length || sos>tar){
    		if(sos==tar){
    			System.out.println(set+'.');
    			return;
    		}
    		return;
    	}
    	printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ", sos+arr[idx], tar);
    	printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }
}