package org.practice.methodcall;

public class MethodCallNoInputNoOutParams {
    public static void main(String[] args) {

        //invocation of method
     printCityName();
     printCityName();

    }
    //method with no input parameters and no return types
    //This is declaration/defination of method
    public static void printCityName(){
        String [] city = {"Ahmedabad", "Patna", "Delhi", "Hyderabad"};
       // System.out.println(city[0]);
        String ahm = "Ahmedabad";
        for(int i=0; i < city.length; i++  ){
          //  System.out.println("city["+i+"]"+city[i]);
            System.out.println("city ["+i +"]= "+city[i] );
            //System.out.println("city "+"["+i +"]"+"="+ " "+city[i] );
            //"city "+"["
            //"city["


        }

    }
//    public static void call(){
//       printCityName();
//        System.out.println(city.length);
//    }
    }

