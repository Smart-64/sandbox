package reflection;

public class Person {
    private final String name;
    private final int age;
    private final String str = "private string";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private String getString() {
        return "string";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
