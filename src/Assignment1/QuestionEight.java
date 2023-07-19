package Assignment1;

import java.util.Scanner;

public class QuestionEight {
    public void gcd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = sc.nextInt();
        System.out.println("Please enter the second number:");
        int b = sc.nextInt();
        int gcd = calculate(a, b);
        System.out.println("GCD is " + gcd);
    }

    private int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        QuestionEight et = new QuestionEight();
        et.gcd();
    }
}
