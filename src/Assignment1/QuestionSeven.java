package Assignment1;

import java.util.Scanner;

public class QuestionSeven {
    public void result() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks:");
        int marks = sc.nextInt();
        String grade = calculateGrade(marks);
        System.out.println("Your grade is " + grade);
    }

    private String calculateGrade(int marks) {
        if (marks < 25) {
            return "F";
        } else if (marks < 45) {
            return "E";
        } else if (marks < 50) {
            return "D";
        } else if (marks < 60) {
            return "C";
        } else if (marks < 80) {
            return "B";
        } else {
            return "A";
        }
    }

    public static void main(String[] args) {
        QuestionSeven qs = new QuestionSeven();
        qs.result();
    }
}
