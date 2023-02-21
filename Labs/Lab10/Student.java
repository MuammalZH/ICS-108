package Labs.Lab10;
import Labs.Lab09.Lab09.Person;

public class Student extends Person{
    private int studentID;
    private double gpa;

    public Student(String name, String phone, int studentID, double gpa) {
        super(name, phone);
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + studentID + "\t" + gpa;
    }
}