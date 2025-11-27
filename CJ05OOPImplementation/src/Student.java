public class Student extends Person{

    private String standard;
    private int fees;
    private String school;
    // Default-access attribute (package-private)
    String major = "Undeclared";

    public Student(String name, int age, String subject) {
        super(name, age);
        major = subject;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStandard() {
        return standard;
    }

    public int getFees() {
        return fees;
    }

    public String getSchool() {
        return school;
    }
}
