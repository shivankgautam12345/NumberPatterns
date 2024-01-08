package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
         System.out.println("Enter the No. of rows:");
         int n = sc.nextInt();
         int k = n*n;
         for(int i = 1;i<=n;i++) {
        	 for(int j = 1;j<=n;j++) {
        		 System.out.print(k+" ");
        		 k--;
        	 }System.out.println();
         }
         
	}

}
//Enter the No. of rows:
//5
//25 24 23 22 21 
//20 19 18 17 16 
//15 14 13 12 11 
//10 9 8 7 6 
//5 4 3 2 1 