package exercise4.university;

import exercise4.food.*;

public class CompetitionEntry {
    private Teacher teacher;
    private Dessert dessert;
    private Student[] students;
    private int[] ratings;

    // for addRating, maximum of 3 ratings
    private int counter;

    public CompetitionEntry(Teacher teacher, Dessert dessert) {
        this.teacher = teacher;
        this.dessert = dessert;
        this.students = new Student[3];
        this.ratings = new int[3];
        counter = 0;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public Student[] getStudents() {
        return students;
    }

    public int[] getRatings() {
        return ratings;
    }

    public boolean addRating(Student student, int rating) {
        if (counter == 3) return false; // Maximum ratings

        for (Student s : students) {
            if (s != null && s.equals(student)) return false; // Student has already rated
        }

        students[counter] = student;
        ratings[counter++] = rating;
        return true;
    }

    public double getRating() {
        if (counter == 0) return 0;

        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += ratings[i];
        }

        return sum / counter;
    }
}
