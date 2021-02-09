/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.domain;

/**
 *
 * @author taufique
 */
import java.util.ArrayList;

public class WeeklyRoutine {

    private ArrayList< Course> courses = new ArrayList<>();	// Create an ArrayList object
    private int[][] routines = new int[DAY][HOUR];

    public static final int DAY = 5;
    public static final int HOUR = 4;

    public static final int HOUR_INDEX = 1;
    public static final int DAY_INDEX = 0;
    public static final int COURSE_INDEX = 2;

    public WeeklyRoutine() {

        for (int i = 0; i < WeeklyRoutine.DAY; i++) {

            for (int j = 0; j < WeeklyRoutine.HOUR; j++) {

                this.routines[i][j] = -1;

            }

        }

    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public int[][] getRoutines() {
        return this.routines;
    }

    // public void setRoutines(int[][] routines) {
    //   this.routines = routines;
    // }
    
    public void addToCourses(Course course) {

        this.courses.add(course);
    }

    public void setToRoutine(int hour, int day, int courseIndex) {

        this.routines[day][hour] = courseIndex;

    }

}
