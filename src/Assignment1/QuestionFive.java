package Assignment1;

import java.util.Scanner;

public class QuestionFive {
    public void user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your roll number:");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter your field of interest:");
        String interest = sc.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + roll +
                ". My field of interest is " + interest + ".");
    }

    public static void main(String[] args) {
        QuestionFive qf = new QuestionFive();
        qf.user();
    }
}
