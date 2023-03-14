package Powerof2;

import java.util.Scanner;

public class Powerof2Program {
		public static void main(String[] args) {
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.close();
			boolean result=powersof2(n);
			
			if(result)
				{System.out.println(n+" is the power of 2");}
			else 
				{System.out.println(n+" is not a power of 2");}
		}
		public static boolean powersof2 (int n) {
			boolean result=false,flag=false;
			while (n!=0) {
				if((n%2!=0)&&(n!=1)) 
					flag=true;
				n=n/2;	
			}
			if(flag==false)result=true;
			return result;
		}
}
