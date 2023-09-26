// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;
    private String oldness;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
        if (age < 7) {
            oldness = "younger";
        } else {
            oldness = "older";
        }
    }

    // method that introduces the Cat
    public void introduce() {
        System.out.println("Hello my name is " + name + " and I am a(n) " + oldness + " cat");
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}


