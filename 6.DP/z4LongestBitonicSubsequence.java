/*////////////////////////////////////Longest Bitonic Subsequence
1. n, representing the number of elements.
2. given n numbers, representing the contents of array of length n.
3. You are required to print the length of longest bitonic subsequence of array.
Note -> bitonic subsequence begins with elements in increasing order, followed by elements in decreasing order.
                               
Input Format:	A number n .. n more elements
Output Format:  A number representing the length of longest increasing subsequence of array.

Sample Input: 	10.. {10 22 9 33 21 50 41 60 80 1}
Sample Output:	7


*/

import java.io.*;
import java.util.*;

public class z4LongestBitonicSubsequence{
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
        	arr[i] = scn.nextInt();
        }

        //left incresing

        int[] leftSide = new int[n];
        leftSide[0] =1; //base case

        for (int i=1; i<n; i++){
        	int pm =0;

        	for(int j=0; j<i; j++){

        		if(arr[i] > arr[j] && pm < leftSide[j]){
        			pm = leftSide[j];
        		}
        	}
        	leftSide[i] = pm+1;
        }

        int[] rightSide = new int[n];
        rightSide[n-1] =1;

        for(int i=n-2; i>=0; i--){
        	
        	int pm =0;
        	for(int j = i+1; j<n; j++){
        		
        		if(arr[i] > arr[j] && pm < rightSide[j]){
        			pm = rightSide[j];
        		}
        	}
        	rightSide[i] = pm+1;
        }

        int maxBC = 0;

        for(int i=0; i<n; i++){
        	if(maxBC < leftSide[i] + rightSide[i]-1){
        		maxBC = leftSide[i] + rightSide[i]-1;
        	}
        }
        System.out.println(maxBC);
    }

}
