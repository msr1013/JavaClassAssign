package Assignment1;

public class Area {
    public void rectangle() {
        int a = 2;
        int b = 3;
        int area = a * b;
        System.out.println("Area of rectangle is " + area);
    }

    public static void main(String[] args) {
        Area a = new Area();
        a.rectangle();
    }
}
