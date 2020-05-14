/*/////////////////////////////Maximum Non-overlapping Bridges
1.N: number of bridges on a river.
2.given n pair of numbers, representing the north bank and south bank co-ordinates of each bridge.
3. You are required to print the count of maximum number of non-overlapping bridges.
Input Format:  n.. n pair of number each on a separate line (and pair separated by space)
Output Format: A number representing the count of maximum number of non-overlapping bridges.
Input: 10
10 20
2 7
8 15
17 3
21 40
50 4
41 57
60 80
80 90
1 30

Output: 7
*/

import java.io.*;
import java.util.*;
public class z10MaxNonOverlappingBridges{

    static class pair implements Comparable<pair>{                                                                                                                                          
        int sp;
        int ep;

        public int compareTO(pair other){
            if(this.sp != other.sp){  //this  Starting point is not equal to others Starting point
                return this.sp - other.sp;
            }
            else{
                return this.ep - other.ep;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //create pair bridges class
        pair[] bridges = new pair[n];
        for(int i=0; i<bridges.length; i++){
            pair bridge = new pair();
            bridge.sp = scn.nextInt(); //Starting bridge from user
            bridge.ep = scn.nextInt(); //Ending bridge from user
            bridges[i] = bridge;   //save at index of bridges;

        }
        //do sorting on bridges class
        Arrays.sort(bridges);
        //create dp
        int[] dp = new int[n];
        dp[0] = 1; //base case

        for(int i=1; i<n; i++){
            int max = 0;

            for(int j=0; j<i; j++){
                if(bridges[i].ep > bridges[j].ep && max < dp[j]){
                    max=dp[j];
                }
            }
            //dp[i] = max+1;
            dp[i] = max++;
        }
        int ans = dp[0];
        for(int i=1; i<n; i++){
            if(ans<dp[i]){
                ans=dp[i];
            }
        }
        System.out.println(ans);
    }
}
