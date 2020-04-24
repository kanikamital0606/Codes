import java.util.*;

public class anyBasetoAnybase{

  public static int anyBasetoDecimal(int n, int b){
    int ans =0, pow =1;
    while(n>0){
      int rem = n%10;
      n = n/10;
      ans = ans + rem*pow;
      pow = pow*b;
    }
    return ans;
  }
  public static int decimalToanyBase( int n, int b){

    int ans =0, pow =1;
    while(n>0){
      int rem = n%b;
      n=n/b;
      ans = ans + rem*pow;
      pow = pow*10;
    }
    return ans;
  }

  public static int anyBasetoAnybase(int n, int sb, int db){

    int decinum = anyBasetoDecimal(n,sb);
    int destnum = decimalToanyBase(decinum, db);
    return destnum;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sb = scn.nextInt();
    int db = scn.nextInt();
    int ans= anyBasetoAnybase(n, sb,db);
    System.out.println(ans);
  }
}