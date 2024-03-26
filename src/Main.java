import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное:\n1. Собака \n2. Кошка ");
        int vibor = scanner.nextInt();
        if (vibor == 1){
            Dog dog = new Dog();
            dog.eat();
            dog.sound();
            dog.play();
        }
        else if(vibor == 2){
            Cat cat = new Cat();
            cat.eat();
            cat.sound();
            cat.play();
        }
    }
    public static class Dog implements Animal, Pet{
        @Override
        public void eat() {
            System.out.println("Все псовые - хищники, они питаются мясом диких и домашних животных,\n птицей и рыбой, которые водятся в их среде обитания.");
        }

        @Override
        public void sound() {
            System.out.println("Собака делает 'гав'");
        }
        @Override
        public void play() {
            System.out.println("Играет в мышь");
        }
    }

    public static class Cat implements Animal, Pet{

        @Override
        public void eat() {
            System.out.println("Кошки — облигатные хищники. \nВ дикой природе они питаются только мясом — мелкими грызунами, птицей, небольшими ящерицами.");
        }

        @Override
        public void sound() {
            System.out.println("Кошка делает 'мяу'");
        }

       @Override
        public void play() {
            System.out.println("Играет в мышь");
        }
    }
}
