package exercise4.university;

public class Student extends Person {
    private String studentId;
    private short academicYear;

    public Student(String name, String surname, int age, String studentId, short academicYear) {
        super(name, surname, age);
        this.studentId = studentId;
        this.academicYear = academicYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "studentId='" + studentId + '\'' +
                ", academicYear=" + academicYear +
                '}';
    }

    // Equality based on student ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }


    public static void main(String[] args) {
        Student student1 = new Student("Jacky", "Jackson", 19, "36512123", (short) 2020);
        Student student2 = new Student("Mark", "Roxon", 27, "36512123", (short) 2020);

        System.out.println(student1);
        System.out.println(student1.equals(student2));
    }
}
