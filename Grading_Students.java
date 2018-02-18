package Implementations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading_Students {

    static int[] solve(int[] grades){
        int temp[] = new int[grades.length];
        int result[] = new int[grades.length];
        
        for(int i=0 ; i<grades.length ; i++) {
        	temp[i] = grades[i] / 5;
        	
        	if(grades[i] < 38)
        		result[i] = grades[i];
        	
        	else if( (temp[i] + 1) * 5 - grades[i]  <  3 ) 
        		result[i] = (temp[i] + 1) * 5;
        	else
        		result[i] = grades[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        
        for(int grades_i=0; grades_i < n; grades_i++)
            grades[grades_i] = in.nextInt();
       
        int[] result = solve(grades);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println();
        

    }
}
