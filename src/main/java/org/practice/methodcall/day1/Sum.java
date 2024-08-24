package org.practice.methodcall.day1;

public class Sum {
    public static void main(String[] args) {

       //Here we are invoking add method and value is return from the add method it is stored in result variable

        //String greet = heading();
        //System.out.println(greet);
       // System.out.println(heading());
        int number1=5;
        int number2=5;
        int result = add(number1,number2);
        System.out.println(heading()+ result + " for " +number1 +"  and "  +number2 );


        //addition();

    }
    //This method returns result of addition and accept two in input parameters so this method is type with input and out put parameters
    public static int add(int number1, int number2){
        int result = number1+number2;
       // System.out.println(result);
        return result;



    }
    public static void addition(){
       int num1 =4;
       int num2=7;
       int result = num1 + num2;
        System.out.println(result);
    }

    public static String heading(){

        return "Result of Addition is  ";

    }

}

