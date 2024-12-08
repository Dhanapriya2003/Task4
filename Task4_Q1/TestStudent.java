package Task4_Q1;

public class TestStudent {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(101, "John Doe", 20, "Computer Science");
            System.out.println(student1);

            // This will throw AgeNotWithinRangeException
            Student student2 = new Student(102, "Jane Doe", 14, "Mathematics");
            System.out.println(student2);

            // This will throw NameNotValidException
            Student student3 = new Student(103, "Tom@123", 18, "Physics");
            System.out.println(student3);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println(e.getMessage());
        }
    }
}
