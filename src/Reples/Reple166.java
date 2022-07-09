package Reples;

public class Reple166 {
}

    class Animal {
        String eats;
        String animal;

        Animal(String animal, String eats){
            this.animal=animal;
            this.eats=eats;
        }

        void eat(){
            System.out.println(animal+"eats");
        }

        void sleep(){
            System.out.println(animal+"sleeps a lot");
        }

    }

    class Cat extends Animal{
        Cat(String animal, String eats) {
            super(animal, eats);
        }

        @Override
        void sleep() {
            System.out.println(animal+"sleeps a lot");
            super.sleep();
        }
    }

    class kitten1 extends Cat{
        kitten1(String animal, String eats) {
            super(animal, eats);
        }

        @Override
        void eat() {
            System.out.println(animal+"eats");
            super.eat();

        }
    }

    class kitten2 extends Cat {

        kitten2(String animal, String eats) {
            super(animal, eats);

        }

        @Override
        void eat() {
            System.out.println(animal + "eats");
            super.eat();
        }

        class kitten3 extends Cat {

            kitten3(String animal, String eats) {
                super(animal, eats);
            }

            @Override
            void eat() {
                System.out.println(animal + "eats");
                super.eat();
            }
        }
    }

