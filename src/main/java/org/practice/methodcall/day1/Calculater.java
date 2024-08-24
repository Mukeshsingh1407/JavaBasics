package org.practice.methodcall.day1;

public class Calculater {
    public static void main(String[] args) {
        int a= 10;
        int b=1;
       int additionResult = addtion(a,b);

       int c = 8;
       int d = 8;
       int subtractionResult= subtraction(c,d);
       int x=4;
       int y=5;
       int multiResult =multiplication(x,y);
       int f=20;
       int z=4;
       int divisionResult=  division(f,z);

        System.out.println("addition of " +a + " and " +b +"= "+additionResult);
        System.out.println("subtraction of " +c +" and " +d +" = " + subtractionResult);
        System.out.println("multiplication of " +x +" and " +y +" = " + multiResult);
        System.out.println("Division of " +f +" and " + z + " = " + divisionResult);
       // System.out.println("additionResult of " +a +" and " + b +additionResult +" subResult "+ subtractionResult +" multiplicationResult " +multiResult +" DivisionResult " + divisionResult);

    }
    public static int addtion(int num1, int num2){
        int result1 =num1 +num2;
        return result1;

    }
    public static int subtraction(int num1, int num2){
        int result2 = num1-num2;
        return result2;
    }
    public static int multiplication(int num1, int num2) {
        int result3 = num1 * num2;
        return result3;
    }
    public static int division(int num1, int num2) {
        int result4 = num1 / num2;
        return result4;
    }
}
