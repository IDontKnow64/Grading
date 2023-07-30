/*
Name: Tommy
Date: 23/09/2022
This program takes an input of a grade points on a course and outputs the letter grade equivalent.
 */
package to;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //creates a scanner for input
        System.out.print("Please enter your mark : ");      //asks the user for the input
        int grade = scanner.nextInt();                          //the input
        char a, b;                                              //declares two char variables, a and b, a for the letter, and b for the plus or minus
        String comment;                                         //declares a string for the comment associated with the grade
        if (grade >= 80){       //if condition for the letter grade A
            a = 'A';
            comment = "A very high to outstanding level of achievement.  Achievement is above the provincial standard";
            if (grade <= 86){
                b = '-';        //adds a minus if between 80 and 86
            }
            else if (grade >= 87 && grade <= 94){
                b = ' ';        //adds nothing if between 87 and 94
            }
            else{
                b = '+';        //adds a plus if greater than 94
            }
        }
        else if (grade >= 70 && grade < 80){    //if condition for the letter grade B
            a = 'B';
            comment = "A high level of achievement.  Achievement is at the provincial standard.";
            if (grade <= 72){
                b = '-';        //adds a minus if between 70 and 72
            }
            else if (grade >= 73 && grade <= 76){
                b = ' ';        //adds nothing if between 73 and 76
            }
            else{
                b = '+';        //adds a plus if between 77 and 79
            }
        }
        else if (grade >= 60 && grade < 70){        //if condition for the letter grade C
            a = 'C';
            comment = "A moderate level of achievement.  Achievement is below, but approaching, the provincial standard.";
            if (grade <= 62){
                b = '-';        //adds a minus if between 60 and 62
            }
            else if (grade >= 63 && grade <= 66){
                b = ' ';        //adds nothing if between 63 and 66
            }
            else{
                b = '+';        //adds a plus if between 67 and 69
            }
        }
        else if (grade >= 50 && grade < 60){        //if condition for the letter grade D
            a = 'D';
            comment = "A passable level of achievement.  Achievement is below the provincial standard";
            if (grade <= 52){
                b = '-';        //adds a minus if between 50 and 52
            }
            else if (grade >= 53 && grade <= 56){
                b = ' ';        //adds a nothing if between 53 and 56
            }
            else{
                b = '+';        //adds a plus if between 57 and 59
            }
        }
        else{           //if condition for the letter grade F
            a = 'F';
            comment = "Insufficient achievement of curriculum expectations.  A credit will not be granted.";
            b = ' ';   //adds nothing since there is no plus or minus for F
        }
        System.out.println("Your letter grade is  : " + a + b);     //outputs the user their letter grade
        System.out.println(comment);        //outputs the comment associated with the letter grade
    }
}
