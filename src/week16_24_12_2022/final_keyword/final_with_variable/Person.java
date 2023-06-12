package week16_24_12_2022.final_keyword.final_with_variable;

public class Person{

    private String name;
    final private String BIRTHDAY;

    public Person(String name, String BIRTHDAY) {
        setName(name);
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getBirthday() {
        return BIRTHDAY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday='" + BIRTHDAY + '\'' +
                '}';
    }
}
