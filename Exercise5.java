/*
UCF COP3330 FALL 2021 ASSIGNMENT 5 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        int one, two;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number? ");
        one = scan.nextInt();
        System.out.println("What is the second number ");
        two = scan.nextInt();
        int sum = one + two;
        int subtract = one - two;
        int multiply = one * two;
        int divide = one / two;
        System.out.println( one + " + " + two + " = " + sum);
        System.out.println( one + " - " + two + " = " + subtract);
        System.out.println( one + " * " + two + " = " + multiply);
        System.out.println( one + " / " + two + " = " + divide);
    }
}
