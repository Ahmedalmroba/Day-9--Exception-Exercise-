import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input */
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = input.nextDouble();

            double sum = number1 + number2;
            double subtract = number1 - number2;
            double product = number1 * number2;
            double divide = number1 / number2;
            double remainder = number1 % number2;

            System.out.println("Sum: " + sum);
            System.out.println("subtract: " + subtract);
            System.out.println("Product: " + product);
            System.out.println("divide: " + divide);
            System.out.println("Remainder: " + remainder);
        }catch (InputMismatchException e) {
            System.out.println("Invalid input enter number only "  );
        }catch (ArithmeticException e) {
            System.out.println("connot divid by zero ");
        }
       /*2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
       Test Data:*/
        try {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            System.out.println("Multiplication Table  " + number + ":");


            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);}

        }catch (InputMismatchException e) {
            System.out.println("Invalid input enter number only ");
        }catch (Exception e) {
            System.out.println(e.getMessage());}

        /* 3. Write a Java program to print the area and perimeter of a circle.*/
        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            double area = 3.14159 * radius * radius;
            double perimeter = 2 * 3.14159 * radius;

            System.out.println("Area of the circle: " + area);
            System.out.println("Perimeter of the circle: " + perimeter);
        }catch (InputMismatchException e) {
            System.out.println("Invalid input enter number only ");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            /*4. Java program to find out the average of a set of integers*/
            try {
                System.out.print("Enter the number of elements: ");
                int count = input.nextInt();
                System.out.println("Enter the elements:");
                int sum1 = 0;
                for (int i = 0; i < count; i++) {
                    try {
                        int num = input.nextInt();
                        sum1 += num;
                    } catch (InputMismatchException l) {
                        System.out.println("Invalid input enter number only ");
                    }catch (Exception a) {
                        System.out.println(e.getMessage());
                    }
                }
                double average = (double) sum1 / count;
                System.out.println("Average: " + average);
            }catch (InputMismatchException n) {
                System.out.println("Invalid input enter number only ");}

      /*5. Write a Java program that accepts three integers as input, adds the first two integers
       together, and then determines whether the sum is equal to the third integer.*/
            try {


                System.out.print("Enter the first integer: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second integer: ");
                int num2 = input.nextInt();
                System.out.print("Enter the third integer: ");
                int num3 = input.nextInt();

                int sum2 = num1 + num2;

                if (sum2 == num3) {
                    System.out.println("The sum of the first two integers is equal to the third integer.");
                } else {
                    System.out.println("The sum of the first two integers is not equal to the third integer.");
                } }catch (InputMismatchException n) {
                System.out.println("Invalid input enter number only ");
            }catch (Exception b) {
                System.out.println(e.getMessage());}
            /* 6. Write a Java program to reverse a word.*/
            try {

                System.out.print("Enter a word: ");
                String word = input.next();
                String reversed_word = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed_word += word.charAt(i);
                }
                System.out.println("Reversed word: " + reversed_word);
            }catch (Exception a) {
                System.out.println(e.getMessage());
            }
            /* 7 - Java program to check whether the given number is even or odd*/

            System.out.print("Enter a number to check even or ood: ");
            try {
                int number3 = input.nextInt();

                if (number3 % 2 == 0) {
                    System.out.println(number3 + " is even.");
                } else {
                    System.out.println(number3 + " is odd.");
                } }catch (InputMismatchException n) {
                System.out.println("Invalid input enter number only ");
            }catch (Exception b) {
                System.out.println(e.getMessage());}
            /* 8 - Java program to convert the temperature in Centigrade to Fahrenheit*/
            try {

                System.out.print("Enter the temperature in Centigrade: ");
                double Centigrade = input.nextDouble();

                double fahrenheit = (Centigrade * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }catch (InputMismatchException n) {
                System.out.println("Invalid input enter number only ");
            }catch (Exception b) {
                System.out.println(e.getMessage());}

            /*9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index.*/
            System.out.print("Enter a string: ");
            String inputString = input.next();
            System.out.print("Enter the index: ");
            int index = input.nextInt();

            try {
                printCharacterAtIndex(inputString, index);
            } catch (Exception a) {
                System.out.println("An error occurred: " + e.getMessage());
            }}}

        public static void printCharacterAtIndex(String inputString, int index) throws Exception {
            if (index >= 0 && index < inputString.length()) {
                char character = inputString.charAt(index);
                System.out.println("Character at index " + index + ": " + character);
            } else {
                throw new Exception("Invalid index.");



            /* 10. Write a Java program to print the area and perimeter of a rectangle.*/
            try {
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();

                System.out.print("Enter the height of the rectangle: ");
                double height = input.nextDouble();

                double area1 = width * height;
                double perimeter1 = 2 * (width + height);

                System.out.println("Area of the rectangle: " + area1);
                System.out.println("Perimeter of the rectangle: " + perimeter1);
            } catch (InputMismatchException x) {
                System.out.println("Invalid input enter number only ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }}}