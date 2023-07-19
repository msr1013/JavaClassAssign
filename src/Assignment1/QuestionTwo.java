package Assignment1;

public class QuestionTwo {
    public void assign() {
        double number = 100.325;
        int convertedNumber = (int) number;
        System.out.println("Conversion of double to int:");
        System.out.println("Original number: " + number);
        System.out.println("Converted number: " + convertedNumber);
    }

    public static void main(String[] args) {
        QuestionTwo qw = new QuestionTwo();
        qw.assign();
    }
}
