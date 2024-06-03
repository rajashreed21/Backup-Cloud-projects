package day9.assignments;
import java.util.*;

public class lambdaex {
    public static void main(String[] args) {
        List<Person> ls = new ArrayList<>();
        ls.add(new Person("Prem", 31));
        ls.add(new Person("Raj", 23));
        ls.add(new Person("Anu", 17));
        ls.add(new Person("Manish", 9));
        ls.add(new Person("Prabha", 57));

        ls.sort((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()));
        ls.forEach(System.out::println);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +", age=" + age +'}';
    }
}
