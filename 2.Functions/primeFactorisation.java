import java.util.*;

public class primeFractorisatio{
    public static void main(String[] args) {
        // write your code here  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div=2;
    
        while(div*div<=n){
            if(n%div==0){
                System.out.println(div+" ");
                n=n/div;
            }
            else{
                div++;
            }
        
        }
    
        if(n!=1){
            System.out.println(n);
        }
    }
}