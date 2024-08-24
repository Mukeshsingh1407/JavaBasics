package org.practice.methodcall;

public class MethodCallWithInputParams {

    public static void main(String[] args) {
       // printCityName("Delhi");
        //printCityName("Goa");
        String [] cityNames = {"Delhi", "Hyderabad", "Pune", "Bhopal", "Mumbai" };
        String [] cityNames2 = {"Hyderabad", "Pune", "Bhopal", "Mumbai" };

        printCityName(cityNames);
        printCityName(cityNames2);

    }
    //Method with input parameter but no output parameter

    public static void printCityName(String [] cityNames){
        for (int i=0;  i< cityNames.length; i++){
            System.out.println(cityNames[i]);
        }



    }
}
