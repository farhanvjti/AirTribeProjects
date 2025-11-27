public class GraduateStudent extends Student{
    //Diamond Problem in Java:
    /*
    The diamond problem arises in multiple inheritance scenarios,
    where a class can inherit from more than one class. Java doesn't support
    multiple inheritance with classes to avoid this issue,
    but it can occur with interfaces sometimes.
    In your current hierarchy of Person → Student → GraduateStudent,
    there's no diamond problem since it's a linear path of single inheritance.
    However, if Java did allow for a class like GraduateStudent to inherit
    directly from both Student and another class like Employee,
    it might be confusing because both Student and Employee
    would potentially inherit from Person. This is the diamond shape.
    To avoid this we use interfaces, Here we can have interface person, interface student
    and interface employee and then graduateStudent is implementing from two interfaces*/
    private String college;

    public GraduateStudent(String name, int age, String subject, String college) {
        super(name, age, subject);
        this.college = college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    public String getCollege() {
        return college;
    }
}
