package com.numberpattern.solve;
import java.util.Scanner;
public class NumberPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter the No. of Rows:");
     int n = sc.nextInt();
     int count = 2;
     for(int i = 1;i<=n;i++) {
    	 for(int j = 1;j<=n;j++) {
    		 if(count<=9) {
    			 System.out.print("0"+count+" ");
    		     count+=2;
    		 }else{
    			 System.out.print(count+" ");
    			 count+=2;
    		 }
    		 
    			 
    		 }System.out.println();
    		 
    		 }
    	 }}
     
     
	


