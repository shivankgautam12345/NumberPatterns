package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the no. of rows:");
       int n   = sc.nextInt();
       int j = 1;
       for(int i= 1;i<=n;i++) {
    	   for(int k = 1;k<=n;k++) {
    		   if(j<=9) {
    			   System.out.print("0"+j+" ");
    		   }else {
    			   System.out.print(j+" ");
    		   }j++;
    	   }System.out.println();
       }
	}

}
//Enter the no. of rows:
//5
//01 02 03 04 05 
//06 07 08 09 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 