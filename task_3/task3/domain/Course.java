package task3.domain;

/**
 *
 * @author taufique
 */
public class Course {

    private String teacherName;
    private String courseName;

    private Course() {

    }

    public Course(String courseName, String teacherName) {

        this.teacherName = teacherName;
        this.courseName = courseName;

    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAndTeacherName() {

        return this.courseName + ", " + this.teacherName;
    }

}
