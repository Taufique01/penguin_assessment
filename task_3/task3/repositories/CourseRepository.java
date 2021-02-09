/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.repositories;

import java.util.ArrayList;
import task3.domain.Course;

/**
 *
 * @author taufique
 */
public class CourseRepository {

    public CourseRepository() {

    }

    public ArrayList<Course> getCourses() {

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("English Grammar", "John Smith"));
        courses.add(new Course("Mathematics", "Lara Gilbert"));
        courses.add(new Course("Physics", "Johanna Kabir"));
        courses.add(new Course("Chemistry", "Danniel Robertson"));
        courses.add(new Course("Biology", "Larry Cooper"));

        return courses;
    }

}
