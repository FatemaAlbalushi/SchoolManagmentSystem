/**
 * 
 */

/**
 * This class is used for School Management System
 * You can Register Student, Manage Student, Hire Teacher, Manage Teacher
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; 


public class School {
	
		public static void main(String[] args)
		
		{
			Scanner input = new Scanner(System.in);
			//ArrayList<String> studentArrayList = new ArrayList<String>();
			String student[] = new String[3];
			int studenti[] = new int[3];
			String studentE[] = new String[3];
			
			
			
			System.out.println("Wellcome to School Management System ");
			System.out.println("Wellcome to Adminstration Page ");
			System.out.println("Menu: ");
			System.out.println("1. Register Student");
			System.out.println("2. Manage Student");
			System.out.println("3. Hire Teacher");
			System.out.println("4. Manage Teacher");
			
			System.out.println("Your option is: ");
			System.out.println("-------------------");
			int actionNum = input.nextInt();
		
			if (actionNum==1) 
			{
				System.out.println("1. Register Student");
				System.out.println("Student Menue: ");
				System.out.println("1. Creat Student");
				System.out.println("2. Read Student");
				System.out.println("3. Update Student");
				System.out.println("4. Delete Student");
				System.out.println("-------------------");
				System.out.println("Your option is: ");
				System.out.println("-------------------");
				int menuNum = input.nextInt();
				if (menuNum==1) 
				{
					
					for (int i = 0; i < student.length; i++) 
					{
						System.out.println("Enter Student Name: ");
						String StudentName  = new Scanner(System.in).nextLine(); 
						System.out.println("-------------------");
						student[i]= StudentName;
						
						System.out.println("Enter Student Id: ");
						int StudentId  = new Scanner(System.in).nextInt(); 
						studenti[i]= StudentId;
						
						System.out.println("Enter Student Email: ");
						String StudentEmail = new Scanner(System.in).nextLine();
						studentE[i]= StudentEmail;
					
						
					}
					for (int i = 0; i < student.length; i++) {
						  System.out.println("Student " + i + 
						                                " : "+ student[i]+ "  " + studenti[i] +"  " + studentE[i]);
						
					
					}

				}
			}
		
			else 
			{
				System.out.println("Exit");
			}
	
		}
}
