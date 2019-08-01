package com.barton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter student details: ");//has to be placed here so that the user see's it first
        Scanner scan = new Scanner(System.in);//input
        String firstName = scan.next();//continuously use this information .next()
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];//using the array again with the num of scores
        for(int i = 0; i < numScores; i++) {//iterate 0 if scores less than this increment by 1
            testScores[i] = scan.nextInt();//use i in the test score (body)
        }


        Student s = new Student (firstName, lastName, id, testScores);//object from student class
        s.printPerson();//print student
        System.out.println("The student in question: "+ "Grade: " + s.calculate());
        scan.close();//stop scanning here
        /**
         * doesn't wor
         */
    }
}
