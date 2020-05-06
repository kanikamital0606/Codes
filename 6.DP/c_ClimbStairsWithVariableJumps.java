//////////////////////////////////Climb Stairs With Variable Jumps
// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. You are given n numbers, where ith element's value represents - till how far from the step you could jump to in a single move. 
// You can of-course fewer number of steps in the move.
// 4. You are required to print the number of different paths via which you can climb to the top.
/*
Sample Input : 
10
3
3
0
2
1
2
4
2
0
0

Sample Output: 15
*/

import java.io.*;
import java.util.*;

public class c_ClimbStairsWithVariableJumps{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] jumps = new int[n];

        for(int i=0; i<n; i++){
        	jumps[i] = scn.nextInt();
        }
        int ans = totalPaths(jumps);
        System.out.println(ans);
        //System.out.println(totalPaths(jumps));
    }

    public static int totalPaths(int[] jumps){

    	//create dp 
    	int[] dp = new int [jumps.length];
    	//fill last index with 1
    	dp[dp.length-1] = 1;

    	for(int i= dp.length-2; i>=0; i--){
    		if(jumps[i] !=0){
    			int cCount =0;
    			for(int j=i+1; j<dp.length && j<=i+jumps[i]; j++){
        			cCount += dp[j];
        		} 
        		dp[i] = cCount;
        	}
        }
        return dp[0];
    }
}