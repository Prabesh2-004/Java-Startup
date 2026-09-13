package Interface;

interface Animals {
    void sound();
    void habitate();
}

class Cat implements Animals {
    public void sound() {
        System.out.println("Cat say: Meow");
    }

    public void habitate() {
        System.out.println("House or street");
    }
}

class Tiger implements Animals {
    public void sound() {
        System.out.println("Tiger say: Gherrrrr");
    }

    public void habitate() {
        System.out.println("Wild");
    }
}
public class RealWorldExample {

    public static void main(String[] args) {
        Animals animals;
        Animals animals1;
        animals = new Cat();
        animals1 = new Tiger();

        animals.sound();
        animals.habitate();

        animals1.sound();
        animals1.habitate();
    }
}
