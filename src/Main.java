import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Box<Fruit> appleBox = new Box<>();
        Box<Fruit> anotherAppleBox = new Box<>();
        Box<Fruit> orangeBox = new Box<>();

        Fruit firstApple = new Apple("Ukraine");
        Fruit secondApple = new Apple("Poland");
        Fruit thirdApple = new Apple("USA");
        Fruit firstOrange = new Orange("USA");
        Fruit secondOrange = new Orange("Africa");

        appleBox.put(firstApple);
        appleBox.put(secondApple);
        anotherAppleBox.put(firstApple);
        anotherAppleBox.put(secondApple);
        anotherAppleBox.put(thirdApple);
        orangeBox.put(firstOrange);
        orangeBox.put(secondOrange);
        System.out.println(appleBox.getFruits());

        System.out.println(appleBox.getWeight() + "F");
        System.out.println(orangeBox.getWeight() + "F");

        System.out.println();

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(anotherAppleBox.compare(orangeBox));

        System.out.println();

        appleBox.merge(orangeBox);
        System.out.println(appleBox.getFruits());
        appleBox.merge(anotherAppleBox);
        System.out.println(appleBox.getFruits());
    }
}