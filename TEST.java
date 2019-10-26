package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class TEST {
	
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hom many Subjects");
		
		int n = Integer.parseInt(br.readLine());
		
		int marks[] = new int[n];
		
		for (int i=0;i<n;i++)
		{
			
			System.out.println("Enter marks :");
			
			marks[i] = Integer.parseInt(br.readLine());
			
		}
		
		
		
		int tot = 0;
		
		for (int i=0;i<n;i++)
		{
			tot += marks[i];
		}
		
		System.out.println("Total marks" + tot);
		
		//total percentage
		
		float percentage = (float) tot/n;
		
		System.out.println("percentage" + percentage);
		
		
	}
}
