public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        distance = (distance > 500) ? 500 :distance;
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        distance = (distance > 10) ? 10 :distance;
        super.swim(distance);
    }
}
