package exercise4.university;

public class Teacher extends Person {
    private String email;
    private String subject;
    private double salary;

    public Teacher(String name, String surname, int age, String email, String subject, double salary) {
        super(name, surname, age);
        this.email = email;
        this.subject = subject;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
