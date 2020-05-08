//////////////////////////////////////////////////////////////////////////////Paint House
/*
1. You are given a number n, representing the number of houses.
2. In the next n rows, you are given 3 space separated numbers representing the cost of painting nth house with red or blue or green color.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

Sample Input 						Sample Output
4
1 5 7
5 8 4
3 2 9
1 2 4								8
*/
import java.io.*;
import java.util.*;

public class p_paintHouse {

    public static void main(String[] args) throws Exception{
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] cost = new int[3][n];
        
        //col representes house
		for(int col=0; col<n; col++){
		    
		    cost[0][col] = scn.nextInt(); //red
		    cost[1][col] = scn.nextInt(); //blue
		    cost[2][col] = scn.nextInt(); //green
        }
        
        int redCost   = cost[0][0];
        int blueCost  = cost[1][0];
        int greenCost = cost[2][0];
        
        for(int col=1; col<n; col++){
		    int red   = cost[0][col] + Math.min(blueCost, greenCost);
		    int blue  = cost[1][col] + Math.min(redCost, greenCost);
		    int green = cost[2][col] + Math.min(redCost, blueCost);
		    
		    redCost = red;
		    blueCost = blue;
		    greenCost = green;
		 }
		 System.out.println(Math.min(redCost, Math.min(blueCost, greenCost)));
    }
}