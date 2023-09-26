public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy", 19, 8.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat ("Ginger", 7, 14);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
