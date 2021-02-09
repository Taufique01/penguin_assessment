package task3.app;

import task3.domain.WeeklyRoutine;
import task3.repositories.CourseRepository;
import task3.services.RoutineSimulation;

/**
 
 * @author taufique
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WeeklyRoutine weeklyRoutine = new WeeklyRoutine();
        RoutineSimulation routineSimulation = new RoutineSimulation();
        CourseRepository courseRepository = new CourseRepository();

        weeklyRoutine.setCourses(courseRepository.getCourses());

        routineSimulation.start(weeklyRoutine);

    }

}
