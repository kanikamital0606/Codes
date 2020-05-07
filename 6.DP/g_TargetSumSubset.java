//////////////////////////////////////////////Target Sum Subsets - Dp
/*
Question
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add upto "tar" or not.

Input Format : A number n: n1; n2 .. n number of elements; A number tar
Output Format true or false as required
Sample Input
5
4
2
7
1
3
10
Sample Output true
*/
import java.io.*;
import java.util.*;

public class g_TargetSumSubset{

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<arr.length; i++){
			arr[i] = scn.nextInt();	
		}

		int tar = scn.nextInt();
		System.out.println(targetSumSubset(arr, tar));
	}

	public static boolean targetSumSubset(int[] arr, int tar){
	    boolean[][] dp = new boolean[arr.length + 1][tar + 1];
	    dp[0][0] =true;
	    
	    for (int i = 1; i <dp.length; i++){
	        for (int j = 0; j <dp[0].length; j++){
	            //element say no
	            dp[i][j] = dp[i-1][j];
	            
	            //element say yes
	            if(j-arr[i-1]>=0 && dp[i-1][j-arr[i-1]] == true){
	                dp[i][j]=true;
	            }
	        }
	    }
	    return dp[dp.length-1][tar];
	}
}

	/*
	public static boolean func(int[] arr, int sum) {
		int n = arr.length;

		boolean dp[][] = new boolean[n + 1][sum + 1];

		for (int i = 0; i < dp.length; i++) {

			for (int j = 0; j < dp[0].length; j++) {

				if (j == 0) {

					dp[i][j] = true;
				} else if (i >= 1 && dp[i - 1][j]) {

					dp[i][j] = dp[i - 1][j];
				} else if (i >= 1 && j - arr[i - 1] >= 0) {

					dp[i][j] = dp[i - 1][j - arr[i - 1]];
				}
			}
		}
		return dp[arr.length][sum];
	}
	public static int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		if (sum < S || (sum + S) % 2 == 1)
			return 0;
		int s = (sum + S) / 2;
		int[] dp = new int[s + 1];
		dp[0] = 1;
		for (int n : nums)
			for (int i = s; i >= n; i--)
				dp[i] += dp[i - n];
		return dp[s];
	}
}*/