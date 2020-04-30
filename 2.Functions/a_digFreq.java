import java.util.*;

public class a_digFreq{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      	int n = scn.nextInt();
      	int d = scn.nextInt();
      	int freq = getDigitFrequency(n, d);
      	System.out.println(freq);
    }
    public static int getDigitFrequency(int n, int d){

    	int freq =0;

    	while(n>0){
    		int cd = n%10;

    		n=n/10;

    		if(cd == d){
    			freq++;
    		}

    	}
    	return freq;
    }
}