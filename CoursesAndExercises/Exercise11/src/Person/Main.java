package Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Person.loadPersons();

        for(Person p : list) {
            System.out.printf("%s %s, %d-%d-%d %s %d%n", p.getName(), p.getSurname(), p.getBirthday(), p.getBirthday().getYear(),
                    p.getBirthday().getMonthValue(), p.getBirthday().getDayOfMonth(), p.getGender(), p.getAge());
        }
    }
}
