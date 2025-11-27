public class Person {

    //Instance Variables (private data members)
    private String name;
    private int age;
    //protected
    protected String nationality = "Unknown";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Public method
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Nationality (protected): " + nationality);
    }
}
