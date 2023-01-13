package pl.edu.agh.wggios.school.person;

public abstract class Person {

    protected String id;
    protected String name;
    protected String surname;
    protected int age;
    protected Male male;

    protected Person(String id, String name, String surname, int age, Male male) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.male = male;
    }

}
