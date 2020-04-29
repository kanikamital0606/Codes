import java.util.*;
public class rotateNO{

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int length=0;
        int temp=n;
        
        while(temp>0){
            temp=temp/10;
            length++;
            
        }
        
        k= k%length; // convert k -k = length 
        if(k<0){
            k=k+length;
        }
        
        int div=1, mul=1;
        
        for(int i=1;i<=length;i++){
        if(i<=k){
            div = div*10;
        }
        else{
            mul = mul *10;
        }
    }
    int quo = n / div;
    int rem = n % div;
   
    int r = rem * mul + quo;
    System.out.println(r);   
    }
}
// INPUT:  562984
// K NO OF TIMES 2
// OUTPUT 845629