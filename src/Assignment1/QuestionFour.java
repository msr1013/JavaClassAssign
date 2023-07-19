package Assignment1;

public class QuestionFour {
    public void perimeter() {
        int a = 2;
        int b = 3;
        int c = 5;
        int perimeter = a + b + c;
        System.out.println("Perimeter of rectangle is " + perimeter);
    }

    public static void main(String[] args) {
        QuestionFour qf = new QuestionFour();
        qf.perimeter();
    }
}
