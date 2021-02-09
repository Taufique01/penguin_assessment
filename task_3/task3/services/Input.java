/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.services;

import java.util.Scanner;
import task3.domain.WeeklyRoutine;

/**
 *
 * @author taufique
 */
public class Input {
    
    private final Scanner scanner;
    
    Input(){
        
       scanner = new Scanner (System.in);
        
    }
    
    public String takeOptionInput(){
        
        String optionSelected = scanner.nextLine ();
        
        return optionSelected;
        
    }
    
    public int[] takeRoutineInput(){
        
        String inputs = scanner.nextLine ();
	
        String[] inputsArray = inputs.split (" ");
        
        int[] number_array = new int[3];

	number_array[WeeklyRoutine.HOUR_INDEX] = Integer.parseInt (inputsArray[WeeklyRoutine.HOUR_INDEX]);
	number_array[WeeklyRoutine.DAY_INDEX]= Integer.parseInt (inputsArray[WeeklyRoutine.DAY_INDEX]);
	number_array[WeeklyRoutine.COURSE_INDEX] = Integer.parseInt (inputsArray[WeeklyRoutine.COURSE_INDEX]);

        return number_array;
    }
    
}
