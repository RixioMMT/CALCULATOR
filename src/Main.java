import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] array) {
        //DEMAND AND RECEIVE INPUT
        System.out.println("Type your equation in one line: a + b + c. Only integers between 1 to 10 inclusive and +-*/ operators are allowed.");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //NULL AND EMPTY EXCEPTION
        if (input == null) {
            System.out.println("Input size is missing information.");
        } else if (input.isEmpty()) {
            System.out.println("Input size is missing information.");
        }
        // PREPARE VARIABLES
        array = input.split(" ");
        int i;
        int rows = (array.length);
        // CHOOSE OPERATION WITH 2 NUMBERS
        if (rows == 3) {
            String number1 = array[0];
            String number2 = array[2];
            if (number1.matches("[-0-9]*") && number2.matches("[-0-9]*")) {
                int[] intarray = new int[rows];
                for (i = 0; i < array.length; i+=2) {
                    intarray[i] = Integer.parseInt(array[i]);
                }
                String operator1 = array[1];
                int integer1 = intarray[0];
                int integer2 = intarray[2];
        // CALL PRIVATE METHOD sysexception
                sysexception(operator1, integer1, integer2);
            } else {
                System.out.println("Invalid number.");
            }
        // CHOOSE OPERATION WITH THREE NUMBERS
        } else if (rows == 5) {
            String number1 = array[0];
            String number2 = array[2];
            String number3 = array[4];
            if (number1.matches("[-0-9]*") && number2.matches("[-0-9]*") && number3.matches("[-0-9]*")) {
                int[] intarray = new int[rows];
                for (i = 0; i < array.length; i+=2) {
                    intarray[i] = Integer.parseInt(array[i]);
                }
                String operator1 = array[1];
                String operator2 = array[3];
                int integer1 = intarray[0];
                int integer2 = intarray[2];
                int integer3 = intarray[4];
        //CALL PRIVATE METHOD sysexceptions
                sysexceptions(operator1, operator2, integer1, integer2, integer3);
            } else {
                System.out.println("Invalid number.");
            }
        // INCORRECT SIZE EXCEPTION
        } else {
            System.out.println("Input size is not valid.");
        }
    }

    // PRIVATE METHOD FOR EXCEPTIONS BETWEEN 2 NUMBERS
    private static void sysexception(String operator1, int integer1, int integer2){
        if (!operator1.equals("+") && !operator1.equals("-") && !operator1.equals("*") && !operator1.equals("/")){
            System.out.println("first operator is not a +-*/ operator");
        } else if (integer1 > 10){
            System.out.println("first number is higher than 10");
        } else if (integer1 < -10){
            System.out.println("first number is lower than -10");
        } else if (integer1 == 0){
            System.out.println("first number can not be 0");
        } else if (integer2 > 10){
            System.out.println("second number is higher than 10");
        } else if (integer2 < -10){
            System.out.println("second number is lower than -10");
        } else if (integer2 == 0){
            System.out.println("second number can not be 0");
        } else {
        //CALL PUBLIC CLASS Arithmetic
            Arithmetic class1 = new Arithmetic();
            class1.operation(operator1, integer1, integer2);
        }
    }

    // PRIVATE METHOD FOR EXCEPTIONS BETWEEN 3 NUMBERS
    private static void sysexceptions(String operator1, String operator2, int integer1, int integer2, int integer3){
        if (!operator1.equals("+") && !operator1.equals("-") && !operator1.equals("*") && !operator1.equals("/")){
            System.out.println("first operator is not a +-*/ operator");
        } else if (!operator2.equals("+") && !operator2.equals("-") && !operator2.equals("*") && !operator2.equals("/")){
            System.out.println("second operator is not a +-*/ operator");
        } else if (integer1 > 10){
            System.out.println("first number is higher than 10");
        } else if (integer1 < -10){
            System.out.println("first number is lower than -10");
        } else if (integer1 == 0){
            System.out.println("first number can not be 0");
        } else if (integer2 > 10){
            System.out.println("second number is higher than 10");
        } else if (integer2 < -10){
            System.out.println("second number is lower than -10");
        } else if (integer2 == 0){
            System.out.println("second number can not be 0");
        } else if (integer3 > 10){
            System.out.println("third number is higher than 10");
        } else if (integer3 < -10){
            System.out.println("third number is lower than 10");
        } else if (integer3 == 0){
            System.out.println("third number can not be 0");
        } else {
        //CALL PUBLIC CLASS ComplexArithmetic
            ComplexArithmetic class2 = new ComplexArithmetic();
            class2.operations(operator1, operator2, integer1, integer2, integer3);
        }
    }
}