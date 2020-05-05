import java.io.*;
import java.util.*;

public class b_printDecreasing{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        printDecreasing(n);
    }
    public static void printDecreasing(int n){

    	if(n==0){
    		return;
    	}
    	System.out.println(n); //5
    	printDecreasing(n-1);
        
        //5-1 =4;
        //4-1= 3; 
        //3-1=2;
        // 2-1=1

        // output = 54321
    }
}