package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int count = 2;
        int count2 = 1;
        int n = sc.nextInt();
        for(int i = 1;i<=n/2;i++) {
        	for(int j = 1;j<=n;j++) {
        		if(i<=n/2) {
        			if(count<=9) {
        			System.out.print("0"+count+" ");
        			}else {
        				System.out.print(count+" ");
        			}
        		}
        		count+=2;
        	}System.out.println();
        }
        for(int i = 1;i<=n/2;i++) {
        	for(int j = 1;j<=n;j++) {
        		if(i<=n/2) {
        			if(count2<=9) {
        			System.out.print("0"+count2+" ");
        			}else {
        				System.out.print(count2+" ");
        			}
        		}
        		count2+=2;
        	}System.out.println();
        }
	}

}
