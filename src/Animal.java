import java.util.ArrayList;

public class Animal {
    private String name;
    private int age;
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

   public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animals.add(this);
    }

    public void run (int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim (int distance) {
        System.out.println(name + " проплыл " + distance + "м");
    }

    public String toString() {
        return "name " + name + " age " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getValue() {
        return animals.size();
    }

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }
}
