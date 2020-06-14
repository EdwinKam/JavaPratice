package com.edwin;

public class GradeBook {
	private String courseName; // course name for this GradeBook
	private String instructorName;
	// constructor initializes courseName with String supplied as argument
	public GradeBook(String name, String pname )
	{
		courseName = name;
		instructorName= pname;// initializes courseName
		System.out.println("==GradeBook constructor is called!!=");
		displayMessage();
		System.out.println( "This course is presented by: "+ instructorName);
		System.out.println("End of GradeBook instructor.==");
	} // end constructor

	// method to set the course name
	public void setCourseName( String name )
	{
		courseName = name; // store the course name
	} // end method setCourseName

	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName

	public String getInstructorName()
	{
		return instructorName;
	} // end method getCourseName

	public void setInstructorName(String name)
	{
		instructorName= name;
	} // end method getCourseName
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		// this statement calls getCourseName to get the
		// name of the course this GradeBook represents
		System.out.printf( "Welcome to the grade book for\n%s!\n",
				getCourseName() );
	} // end method displayMessage
}
