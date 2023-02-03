package circus;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting (referring to a child class as its parent class [or someone higher])
        getToSpeak(bird);

        Animal animal = (Animal) bird; // upcasting ***upcasting is redundant
        getToSpeak(animal);

        Duck d2 = (Duck) animal; // downcasting (referring to a parent class as a its child class [or someone lower])
        getToSpeak(d2);

        train(new Duck());
        // train(new Parrot()); // cannot anyhow downcast. swim() behaviour in Duck but not Parrot

        // Animal a2 = new Animal();
        // Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not a duck! Not a duck!");
        }
    }
}
