package com.edwin;

public class Gradebooktest {
	// main method begins program execution
	public static void main( String args[] )
	{
		// create GradeBook object and initialize data
		GradeBook gradeBook1 = new GradeBook( "ENG CS 60 JAVA Programming", "Judy Jones" );

		// display change instructor name
		System.out.printf( "\nChanging instructor name from %s to Sonny Huang\n", gradeBook1.getInstructorName());
		// call setInstructorName function to set a new name.
		gradeBook1.setInstructorName( "Sonny Huang" );

		//display change course name
		System.out.printf( "Changing course name from %s to CISP401 Object Oriented Programming with JAVA\n\n", gradeBook1.getCourseName());
		// call setCourseName function to set a new name.
		gradeBook1.setCourseName( "CISP401 Object Oriented Programming with JAVA" );

		gradeBook1.displayMessage(); // display welcome message
	} // end main
}
