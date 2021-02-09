/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.services;

import task3.domain.WeeklyRoutine;

/**
 *
 * @author taufique
 */
public class RoutineSimulation {

    private final Output output = new Output();
    private final Input input = new Input();

    public RoutineSimulation() {

    }

    private void doForA(WeeklyRoutine weeklyRoutine) {

        this.output.showIndexAndCourseName(weeklyRoutine.getCourses());
        int[] inArr = this.input.takeRoutineInput();
        weeklyRoutine.setToRoutine( inArr[WeeklyRoutine.HOUR_INDEX],
                inArr[WeeklyRoutine.DAY_INDEX], 
                inArr[WeeklyRoutine.COURSE_INDEX]);
        this.resume(weeklyRoutine);

    }

    private void doForB(WeeklyRoutine weeklyRoutine) {
        this.output.showRoutines(weeklyRoutine.getRoutines(), weeklyRoutine.getCourses());

    }

    private void doForC(WeeklyRoutine weeklyRoutine) {
        this.output.showCourseAndTecherName(weeklyRoutine.getCourses());

    }

    public void start(WeeklyRoutine weeklyRoutine) {

        //custom implementation on start if required
        this.resume(weeklyRoutine);
    }

    private void resume(WeeklyRoutine weeklyRoutine) {

        this.output.showOptions();

        String optionSelected = input.takeOptionInput();

        switch (optionSelected) {

            case "A":
                this.doForA(weeklyRoutine);
                break;
            case "B":
                this.doForB(weeklyRoutine);
                break;
            case "C":
                this.doForC(weeklyRoutine);
                break;
            default:
                break;
        }

    }

}
