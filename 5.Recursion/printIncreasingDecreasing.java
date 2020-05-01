import java.io.*;
import java.util.*;

public class printIncreasingDecreasing{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pdi(n);
    }

    public static void pdi(int n){
    	
        //Base Case //1-1 =0 
        if(n==0){
    		return;
    	}
    	System.out.println(n); //54321
    	pdi(n-1);              
    	System.out.println(n); //1234
5


    }

}