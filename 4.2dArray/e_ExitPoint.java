import java.io.*;
import java.util.*;
public class e_ExitPoint{
	public static void main(String[] args)throws Exception{
		Scanner scn = new Scanner(System.in);

		int m = scn.nextInt();
		int n = scn.nextInt();

		int[] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
            	arr[i][j] = scn.nextInt();
            }
        }
        
    }
}
