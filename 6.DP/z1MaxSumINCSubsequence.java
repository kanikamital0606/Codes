/*/////////////////////////////////////Maximum Sum Increasing Subsequence
1. n, number of elements.
2. n numbers, representing the contents of array of length n.
3. sum of elements of the increasing subsequence with maximum sum for the array.
                               
Input Format: A number n .. n more elements
Output Format: number representing sum of elements of increasing subsequence with maximum sum for the array.
Sample Input: 10 {10 22 9 33 21 50 41 60 80 1}
Sample Output: 255
*/

import java.io.*;
import java.util.*;

public class z1MaxSumINCSubsequence{
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
    		arr[i] = scn.nextInt();
    	}
    	int[] dp = new int[n];
    	dp[0] = arr[0];

    	for(int i=1; i<n; i++){
    		dp[i] = arr[i];
    		int prevMax=0;
    		for(int j=0; j<i; j++){
    			if(arr[i] >= arr[j] && prevMax < dp[j]){
    				prevMax = dp[j];
    			}
    		}
    		if(prevMax + arr[i] > dp[i]){
    			dp[i] = prevMax + arr[i];
    		}
    	}
    	int max = dp[0];
    	for(int i=1; i<n; i++){
    		if(dp[i]>max){
    			dp[i]=max;
    		}
    	}
    	System.out.println(max);
    }
}
