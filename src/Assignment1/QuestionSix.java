package Assignment1;

import java.util.Scanner;

public class QuestionSix {
    public void discount() {
        int unitCost = 100;
        double discount = 0.1;
        int minAmt = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the quantity:");
        int quantity = sc.nextInt();
        double totalCost = quantity * unitCost;
        if (totalCost > minAmt) {
            double discountAmt = totalCost * discount;
            totalCost -= discountAmt;
        }
        System.out.println("Total cost is " + totalCost);
    }

    public static void main(String[] args) {
        QuestionSix qs = new QuestionSix();
        qs.discount();
    }
}
