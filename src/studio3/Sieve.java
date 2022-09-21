package studio3;

import java.util.Scanner;

public class Sieve {
	
	public static void main(String[] args) {
		// scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number do you want to check until?");
		int n = in.nextInt(); 
		boolean[] sieve = new boolean[n];
	
		for (int i = 0; i < n; i++)
		{
			 sieve[i] = true;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++)
		{
			if (sieve[i] == true) {
				
				for(int j = i*i; j<n; j=j+i) {
					sieve[j] = false;
					
				}
				
			}
		}
		
		for (int i=2; i<n; i++) {
			if (sieve[i] == true) {
				System.out.println(i);
			}
		}
		
		
	}	
}
	
	

