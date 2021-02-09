/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.services;

import java.util.ArrayList;
import task3.domain.Course;
import task3.domain.WeeklyRoutine;

/**
 *
 * @author taufique
 */
public class Output {

    public void showOptions() {

        System.out.println("A. Create Routine");
        System.out.println("B. Show Routine");
        System.out.println("C. List Courses with Teachers Name");
    }

    public void showCourseAndTecherName(ArrayList< Course> courses) {

        courses.forEach((course) -> {
            System.out.println(course.getCourseAndTeacherName());
        });

    }

    public void showIndexAndCourseName(ArrayList< Course> courses) {

        for (int i = 1; i <= courses.size(); i++) {
            System.out.println(i + ". " + courses.get(i - 1).getCourseName());

        }
    }

    public void showRoutines(int[][] routines, ArrayList< Course> courses) {

        for (int i = 0; i < WeeklyRoutine.DAY; i++) {

            for (int j = 0; j < WeeklyRoutine.HOUR; j++) {

                if (routines[i][j] != -1) {

                    System.out.println(i + " " + j + " "
                            + courses.get(routines[i][j]).getCourseName());
                }

            }

        }

    }

}
