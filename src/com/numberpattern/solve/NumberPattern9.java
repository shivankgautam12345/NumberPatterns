package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the no. of Rows:");
       int n = sc.nextInt();
       int count = 1;
       for(int i = 1;i<=n;i++) {
    	   for(int j = 1;j<=n;j++) {
    		   if(count<=9) {
    			   System.out.print("0"+count);
    		   }else {
    			   System.out.print(count);
    		   }count+=2;
    	   }System.out.println();
       }
       
	}

}
