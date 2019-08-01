package com.barton;

public class Student extends Person {
    private int[] testScores; //the array for the student details

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);//using these parameters from the Student method
        this.testScores = scores;//this keyword refers to the object were the method or constructor is being invoked
    }
    public char calculate() {//char calculator
        int average = 0;//average given its local primitive data type to ensure that all average scores start at zero
        for (int i = 0; i < testScores.length; i++) {//for every i = 0 like the average score and if i is less than length of scores increment by 1
            average += testScores[i];//average is more or equal to test scores to the power of i
        }
        average = average / testScores.length;//works out the average the test score divided by all test scores
        if (average >= 90) {
            return 'O';

        } else if (average >= 80) {
            return 'A';

        } else if (average >= 70) {
            return 'P';

        } else if (average >= 55) {
            return 'D';

        } else if (average >= 55) {
            return 'U';

        } else  {
            return 'T';
        }

    }
}
