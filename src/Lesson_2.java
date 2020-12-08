public class Lesson_2 {
    public static final String name = "Petya";

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];

        Cat cat1 = new Cat();
        cat1.name = "Viktor";
        cat1.age = 21;

        Cat cat2 = new Cat();
        cat2.name = "Petr";
        cat2.age = 22;

        Cat cat3 = new Cat();
        cat3.name = "Nani";
        cat3.age = 54;
        System.out.println("Critical error");
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = new Cat();

        System.out.println("sdkjfhdeuhgbiuhgfuifhdgikjfsuhdgjhifsdghjvfhjikfdgvjhnknvfjhikfvgjhikn");

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + " " + cats[i].age);
        }

        System.out.println("Ni");
        System.out.println(getName() + " " + name);

        System.out.println("NANI");
    }

    public static String getName() {
        return "Petr";
    }
}
