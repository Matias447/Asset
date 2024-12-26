public class Person {

    private String name;
    private String surname;
    private int age;
    private boolean gender;


    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30, true);  // true - Male
        System.out.println(person.toString());
    }
}
