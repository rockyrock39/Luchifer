package com;

import java.util.ArrayList;

public class threeDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int dept, Student, marks,tot=0;
		
		int arr[][][]= {{{50,51,52},{60,61,62}},{{70,71,72},{80,81,82}},{{65,66,67},{75,76,77}}};
		for (dept =0;dept<3;dept++)
		{
			System.out.println("Dept"+(dept+1)+":");
			for (Student =0;Student<2;Student++)
			{
				System.out.print("Student "+(Student+1)+" marks :" );
				for (marks =0;marks<3;marks++)
				{
					System.out.print(" " +arr[dept][Student][marks]+ " ");
					tot += arr[dept][Student][marks];
				}
				
				System.out.println("Total Marks :"+ tot);
				tot=0;
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

}
