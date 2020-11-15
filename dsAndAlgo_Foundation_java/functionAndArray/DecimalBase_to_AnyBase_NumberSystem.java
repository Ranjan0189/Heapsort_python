package dsAndAlgo_Foundation_java.functionAndArray;

import java.util.Scanner;

public class DecimalBase_to_AnyBase_NumberSystem {
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static int getValueInBase(int n, int b){
	       // write code here
	       int res = 0;
	       int pow = 1;
	       while(n > 0) {
	           int rem = n % b;
	           n = n / b;
	           res = rem * pow + res;
	           pow = pow * 10;
	       }
	       
	       return res;
	   }
}
