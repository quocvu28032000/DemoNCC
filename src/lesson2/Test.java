package lesson2;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal fish = new Fish();
        Animal cat = new Cat();

        //gọi phương thức Override
        animal.move();
        fish.move();
        cat.move();
    }
}
