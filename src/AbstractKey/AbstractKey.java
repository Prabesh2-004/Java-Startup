package AbstractKey;

abstract class Car {
    abstract public void Drive(); // abstract method only be use if class is abstract else abstract cannot be used but any normal method can be used inside abstract class

    abstract public void Gear();

    public void PlayMusic() {
        System.out.println("Playing Music...");
    }
}

abstract class BMW extends Car {

    @Override
    public void Drive() {
        System.out.println("Driving...");
    }
}

class UpdatedBMW extends BMW { // concrete class
    @Override
    public void Gear() {
        System.out.println("Changing Gear...");
    }
}

public class AbstractKey {
    public static void main(String[] args) {
//        Car car = new Car(); // cannot create an object of abstract class
//        BMW bmw = new BMW(); // cannot create an object of abstract class
        UpdatedBMW updatedBMW = new UpdatedBMW();
        updatedBMW.Drive();
        updatedBMW.PlayMusic();
        updatedBMW.Gear();
    }
}
