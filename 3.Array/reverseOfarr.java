/*
import java.io.*
import java.util.*

public class reverseOfarr.java{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

		int s1 = scn.nextInt();

		int[] a = new int[s1]; 

		for (int i=0; i< s1; i++) {
		
			a[i] = scn.nextInt();
		}

		System.out.println(a[i]);
	}
}*/

import java.io.*;
import java.util.*;

public class reverseOfarr{
	public static void display(int[] a){
		StringBuilder sb = new StringBuilder();

    	for(int val: a){
    		sb.append(val + " ");
    	}
    	System.out.println(sb);
    }

    public static void reverse(int[] a){
    	// write your code her
    	int i=0, j=a.length-1;

    	while(i<j){
    		int temp=a[i];
    		a[i] = a[j];
    		a[j] = temp;
    		i++; j--;
    	}
    }

    public static void main(String[] args) throws Exception {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++){

    		a[i] = Integer.parseInt(br.readLine());
    	}

    	reverse(a);
    	display(a);
 	}
}
