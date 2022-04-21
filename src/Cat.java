public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        distance = (distance > 200) ? 200 :distance;
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        return;
    }
}
