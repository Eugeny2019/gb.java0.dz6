import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        Dog[] dog = new Dog[2];
        cat[0] = new Cat("Барсик", 1);
        cat[1] = new Cat("Мурзик", 2);
        cat[2] = new Cat("Пушок", 3);
        dog[0] = new Dog("Шарик", 5);
        dog[1] = new Dog("Бобик", 7);

        System.out.println("Всего " + Animal.getValue() + " животных:");

        ArrayList<Animal> animal = Animal.getAnimals();
        //вывод всех животных
        for (int i = 0; i < animal.size(); i++) {
            System.out.printf("Вид: %s Кличка: %s Возраст: %d\n",
                    animal.get(i).getClass().getName(),
                    animal.get(i).getName(),
                    animal.get(i).getAge());
        }
        System.out.println();

        //задание действий со случайными параметрами
        for (int i = 0; i < animal.size(); i++) {
            animal.get(i).run(new Random().nextInt(700) + 1);
            animal.get(i).swim(new Random().nextInt(15) + 1);
        }
    }
}

