package exercise4.university;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person that = (Person) obj;

        if (this.name == null) {
            if (that.name != null) return false;
        } else if (!this.name.equals(that.name)) return false;
        if (this.surname == null) {
            if (that.surname != null) return false;
        } else if (!this.surname.equals(that.surname)) return false;

        return this.age == that.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jack", "Jackson", 25);
        Person p2 = new Person("Jack", "Jackson", 25);
        Person p3 = new Person("Jack", "Jackson", 20);
        Person p4 = new Person("Harrison", "Jackson", 25);
        Person p5 = new Person(null, "Jackson", 25);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals("random"));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p5.equals(p1));
    }

}
