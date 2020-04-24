import java.io.*;
import java.util.*;

public class sumOf2arr{
    
    public static int[] addtion(int []a, int []b){
        
        //compare length
        int length = a.length;
        if(length < b.length){
            length = b.length;
        }

        int[] ans = new int[length+1];

        int i= a.length-1, j=b.length-1, k=length, carry =0;

        while(i>=0 && j>=0){

            int sum = a[i]+b[j]+carry;
            carry = sum/10;  //update carry
            ans[k] = sum%10; //update length of result carry
            i--; j--; k--;   //decrement each 
        } 

        while(i>=0){  
            int sum = a[i]+ carry;
            carry = sum/10;  //update carry
            ans[k] = sum%10; //update length of result carry
            i--; k--;   //decrement each 
        }

        while(j>=0){  
            int sum = b[j]+ carry;
            carry = sum/10;  //update carry
            ans[k] = sum%10; //update length of result carry
            j--; k--;   //decrement each 
        }

        if (carry>0){
            ans[k] = carry;
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    
    int size1 = scn.nextInt();
    //arr1
    int[] a = new int[size1];
    
    for(int i=0; i<size1; i++){
        a[i] = scn.nextInt();
    }

    int size2 = scn.nextInt();
    int []b = new int[size2];
    
    for(int i=0; i<size2; i++){
        b[i] = scn.nextInt();
    }


    int[] ans = addtion(a,b);

    for(int i=0; i<ans.length; i++){

        if (i==0 && ans[i] ==0){

        }
        else{
            System.out.println(ans[i] + " ");
        }
    }
 }

}