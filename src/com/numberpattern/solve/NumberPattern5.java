package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
         System.out.println("Enter the no. of rows:");
         int n = sc.nextInt();
         System.out.println("Enter the no. of columns:");
         int m = sc.nextInt();
         int count = 1;
         for(int i = 1;i<=n;i++) {
        	 for(int j = 1;j<=m;j++) {
        		 System.out.print(count+" ");
        		 count++;
        	 }System.out.println();
         }
	}

}
//Enter the no. of rows:
//5
//Enter the no. of columns:
//5
//1 2 3 4 5 
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 
