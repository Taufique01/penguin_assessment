
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;





class Course
{


  private String teacher_name;
  private String course_name;



  private Course ()
  {

  }



  public Course (String course_name, String teacher_name)
  {



    this.teacher_name = teacher_name;
    this.course_name = course_name;


  }

  public String getCourse_name ()
  {

    return this.course_name;

  }




  public String getCourse_teacher_name ()
  {



    return this.course_name + ", " + this.teacher_name;
  }




}



class CourseRoutine
{


  private ArrayList < Course > courses = new ArrayList < Course > ();	// Create an ArrayList object

  private int DAY = 5;
  private int HOUR = 4;

  private int[][] routines = new int[DAY][HOUR];

  public CourseRoutine ()
  {






    for (int i = 0; i < this.DAY; i++)
      {

	for (int j = 0; j < this.HOUR; j++)
	  {

	    this.routines[i][j] = -1;

	  }

      }



  }

  public void addToCourses (Course course)
  {


    this.courses.add (course);
  }


  public void showInitialScreen ()
  {

    Scanner scanner = new Scanner (System.in);

    System.out.println ("A. Create Routine");
    System.out.println ("B. Show Routine");
    System.out.println ("C. List Courses with Teachers Name");


    String option_selected = scanner.nextLine ();
    
    if (option_selected.equals ("C"))
      {

      for (Course course:courses)
	  {
	    System.out.println (course.getCourse_teacher_name ());
	  }

      }


    else if (option_selected.equals ("A"))
      {

	for (int i = 1; i <= this.courses.size (); i++)
	  {
	    System.out.println (i + ". " +
				this.courses.get (i - 1).getCourse_name ());

	  }

	String input = scanner.nextLine ();
	String[]numbers = input.split (" ");

	int day = Integer.parseInt (numbers[0]);
	int hour = Integer.parseInt (numbers[1]);
	int c_index = Integer.parseInt (numbers[2]);


	//System.out.println(day+" "+hour);

	this.routines[day][hour] = c_index;

	this.showInitialScreen ();


      }




    else if (option_selected.equals ("B"))
      {

	for (int i = 0; i < this.DAY; i++)
	  {

	    for (int j = 0; j < this.HOUR; j++)
	      {

		if (this.routines[i][j] != -1)
		  {

		    System.out.println (i + " " + j + " " +
					this.courses.get (routines[i][j] -
							  1).getCourse_name
					());
		  }


	      }

	  }




      }
  }





}




public class Main
{

  public static void main (String args[])
  {



    CourseRoutine course_routine = new CourseRoutine ();

      course_routine.addToCourses (new
				   Course ("English Grammar", "John Smith"));
      course_routine.addToCourses (new
				   Course ("Mathematics", "Lara Gilbert"));
      course_routine.addToCourses (new Course ("Physics", "Johanna Kabir"));
      course_routine.addToCourses (new
				   Course ("Chemistry", "Danniel Robertson"));
      course_routine.addToCourses (new Course ("Biology", "Larry Cooper"));

      course_routine.showInitialScreen ();

  }







}
