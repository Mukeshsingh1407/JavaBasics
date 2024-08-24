package org.practice.methodcall.day1;

import java.sql.SQLOutput;

public class Student {
    public static void main (String[] args){
     displayResult();



    }

    public static void displayResult(){
        String [] studentName = {"Mahesh", "Suresh", "Dinesh"};
        int [] marks = {67, 89, 54};
       for (int i=0; i<studentName.length; i++){
           System.out.println(studentName[i] +"  score" + marks[i] +" mark");
       }



    }

}
