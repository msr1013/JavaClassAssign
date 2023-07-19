package Assignment1;

public class QuestionThree {
    public void square() {
        double number = 3.9;
        double result = number * number;
        System.out.println("Square of the number is " + result);
    }

    public static void main(String[] args) {
        QuestionThree qt = new QuestionThree();
        qt.square();
    }
}
