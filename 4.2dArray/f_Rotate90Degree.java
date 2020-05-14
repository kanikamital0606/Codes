/////////////////////////////////////////////Rotate By 90 Degree

import java.io.*;
import java.util.*;

public class f_Rotate90Degree{
	
	//transpose
    public static void transpose(int[][] arr){
        //Upper Half
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){ //j= row+1
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        transpose(arr);
        
        //Swap 1coloumn with last coloumn
        for(int j=0; j<arr[0].length/2; j++){
            for(int i=0; i<arr.length; i++){
                int temp  = arr[i][j];
                arr[i][j] = arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j] = temp;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}