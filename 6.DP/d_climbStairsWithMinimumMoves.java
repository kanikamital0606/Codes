//////////////////////////Climb Stairs With Minimum Moves
/*
1. You are given a number n,representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you could jump to in a single move. 
You can of-course fewer number of steps in the move.
4. You are required to print the number of minimum moves in which you can reach the top of staircase.
Note -> If there is no path through the staircase print null.

Sample Input
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
Output Format: A number representing the number of ways to climb the stairs from 0 to top.
Sample Output : 4;
*/

import java.io.*;
import java.util.*;

public class d_climbStairsWithMinimumMoves{
	public static void main(String[] args) throws Exception {
        // write your code here'
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] jumps = new int[n];

        for(int i=0; i<n; i++){
        	jumps[i] = scn.nextInt();
        }
        int ans = minJumps(jumps);
        if(ans == Integer.MAX_VALUE)
        System.out.println("null");
        else
        System.out.println(ans);
    }

    public static int minJumps(int[] jumps){

    	int[] dp = new int [jumps.length];
    	//base case fill dp[n-1] =0;
    	dp[dp.length-1] =0;

    	for(int i=dp.length-2; i>=0; i--){
    		if(jumps[i]==0){
    			dp[i] = Integer.MAX_VALUE;
    		}
    		else{
    			int mj = Integer.MAX_VALUE;
    			for(int j=i+1; j<dp.length && j<=i+jumps[i]; j++){
    				if(mj>dp[j]){
    					mj = dp[j];
    				}
    			}

    			if(mj == Integer.MAX_VALUE)
    			dp[i] = Integer.MAX_VALUE;
    			else
    			dp[i] = mj+1;
    		}
    	}
    	return dp[0];
    }
}