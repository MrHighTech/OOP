package exercise5.university;

import java.util.Arrays;

public class Student extends Person {
    private short academicYear;
    private int[] grades;

    public Student(int id, String name, short academicYear, int[] grades) {
        super(id, name);
        this.academicYear = academicYear;
        this.grades = grades;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public double getGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return (double) sum / grades.length;
    }
    
}
