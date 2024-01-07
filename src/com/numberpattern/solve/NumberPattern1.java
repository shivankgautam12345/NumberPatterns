package com.numberpattern.solve;
import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the no. of rows:");
    int n = sc.nextInt();
    System.out.println("Enter the no. of Columns:");
    int m = sc.nextInt();
    
    for(int i = 1;i<=n;i++) {
    	for(int j = 1;j<=m;j++) {
    		System.out.print(i);
    	}System.out.println();
    }
	}

}
//Enter the no. of rows:
//5
//5
//11111
//22222
//33333
//44444
//55555
