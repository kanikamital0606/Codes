import java.io.*;
import java.util.*;
public class s4nextGreaterelement{
    
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        
        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in); //Input
    
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
    
        int[] nge = solve(a);
        display(nge);
    }
    
    public static int[] solve(int[] arr){
        // solve
    return null;
    }

}



    public static void main(String[] args) throws Exception{
        
        
        
        Stack<Integer> st = new Stack <>(); //Declare String 
        st.push(arr[arr.length-1]); //push from last 

        nge[arr.length-1] = -1;
        
        for(int i = arr.length-2; i>=0; i--){ //loop from second last element
            //pop ans push
            //-    a    +

            while(st.size() > 0 && arr[i] >= st.peek()){

                st.pop();

            }

            if(st.size() ==0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return nge;

    }
}   
