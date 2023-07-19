package Assignment1;

import java.util.Scanner;

public class QuestionNine {
    public void fact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        int fact = calculateFactorial(number);
        System.out.println("Factorial is " + fact);
    }

    private int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        QuestionNine qn = new QuestionNine();
        qn.fact();
    }
}
