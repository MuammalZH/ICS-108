package Labs.Lab09;

public class Lab09 {
    public static void main(String[] args) {
        Person Salem = new Person("Salem", "0501331845");
        students Reem = new students("Reem", "0564448202", "200000", 3.6);
        employee Saad = new employee("Saad","0563428255" , ": 200003", 16000);

        System.out.println(Salem.toString());
        System.out.println(Reem.toString());
        System.out.println(Saad.toString());
    }
}
class Person{
    private String name;
    private String phoneNumber;

    Person(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "Name: " + this.name
        + " Phone number: " + this.phoneNumber;
        
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
}

class students extends Person{
    private String ID; 
    private double GPA;

    students(String name, String phoneNumber, String ID ,double GPA){
        super(name, phoneNumber);
        this.ID = ID;
        this.GPA= GPA;
    }

    public String toString(){
        return "Name: " + super.getName()
        + " Phone number: " + super.getPhoneNumber()
        + " ID: " + this.ID
        + " GPA: " + this.GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }
}

class employee extends Person{
    private String ID;
    private double salary;

    employee(String name, String phoneNumber , String ID, double salary){
        super(name, phoneNumber);
        this.ID= ID;
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + super.getName()
        + " Phone number: " + super.getPhoneNumber()
        + " ID: " + this.ID
        + " monthly salary: " + this.salary;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

