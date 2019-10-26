/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author hiranyakumarsarma
 *
 */
public class MultyDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float s[][]={ {1,2,34,56},{13,23,45,66.1f},{12.1f,13.14f,14,36}};
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the nunber of rows and column");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		float array[][] = new float[r][c];
		
		System.out.println("enter the rows and column");
		
		for(int k=0;k<r;k++)
		for(int l=0;l<c;l++)
		array[k][l]=sc.nextInt();
		
		for (int k=0;k<r;k++)
		{
			for (int l=0;l<c;l++)
			{
				System.out.print(array[k][l]+"\t");
			}
			System.out.println(" ");
		}
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(s[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");

	//after transporse
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(s[j][i]+"\t");
			}
			System.out.println(" ");
		}
		
	}

}
