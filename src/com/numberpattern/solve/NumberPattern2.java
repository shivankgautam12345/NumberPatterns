package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no. of Rows:");
        int n = sc.nextInt();
        System.out.println("Enter the no. of Columns:");
        int m = sc.nextInt();
        for(int i = 1;i<=n;i++) {
        	for(int j = 1;j<=m;j++) {
        		System.out.print(j);
        	}System.out.println();
        }
        
	}

}
//Enter the no. of Rows:
//5
//Enter the no. of Columns:
//5
//12345
//12345
//12345
//12345
//12345
