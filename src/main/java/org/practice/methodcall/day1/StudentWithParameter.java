package org.practice.methodcall.day1;

import java.sql.SQLOutput;

public class StudentWithParameter {
    public static void main(String[] args) {
        String [] studentNames={"Mahesh","Suresh", "Dinesh","Rakesh"};
        int [] studentMarks={90,78,45,67};
        studentParameter(studentNames, studentMarks);

    }
    public static void studentParameter(String[] studentNames, int[] studentMarks) {
         for(int i=0; i<studentNames.length; i++){
             System.out.println(studentNames[i] + " scored" +studentMarks[i] + " marks");
         }

    }
}
