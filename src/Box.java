import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<Fruit> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void put(T fruit) {
        if (fruits.isEmpty() || fruit.getClass().equals(fruits.get(0).getClass())) {
            fruits.add(fruit);
        } else {
            throw new IllegalArgumentException("It is prohibited to add different types of fruits");
        }
    }

    public void putAll(List<? extends T> fruits) {
        for (T fruit : fruits) {
            put(fruit);
        }
    }

    public double getWeight() {
        double weight = 0;

        for (Object fruit : fruits) {
            if (fruit.getClass().equals(Apple.class)) {
                weight += 1;
            } else {
                weight += 1.5;
            }
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void merge(Box<?> box) {
        List fruitsToMerge = box.getFruits();
        if (fruitsToMerge.get(0).equals(fruits.get(0))) {
            for (Object fruit : fruitsToMerge) {
                fruits.add((Fruit) fruit);
            }
        }
    }
}