public class Student {
    private String name;
    private double age;
    private double gpa;
    private int satScore;

    public Student(String name1, double age1, double gpa1, int sat) {
        name = name1;
        age = age1;
        gpa = gpa1;
        satScore = sat;
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My GPA is " + gpa);
        System.out.println("My SAT score is " + satScore);
    }

    public void collegeReady() {
        System.out.println("I don't know. What, you think I know how college applications work?");
    }
}