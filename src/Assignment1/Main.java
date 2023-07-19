package Assignment1;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student("John Doe");

        // Getting the name of the student
        String name = student.getName();
        System.out.println("Student name: " + name);

        // Setting a new name for the student
        student.setName("Jane Smith");

        // Getting the updated name of the student
        String updatedName = student.getName();
        System.out.println("Updated student name: " + updatedName);
    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public Student() {
            this.name = "Unknown";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
