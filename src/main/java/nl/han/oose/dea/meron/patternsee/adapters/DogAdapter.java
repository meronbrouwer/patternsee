package nl.han.oose.dea.meron.patternsee.adapters;

import nl.han.oose.dea.meron.patternsee.Dog;
import nl.han.oose.dea.meron.patternsee.factories.AnimalSound;

public class DogAdapter implements AnimalSound {
    Dog dog;

    public DogAdapter(){
        dog = new Dog();
    }

    @Override
    public String makeSound(int numberOfSounds) {


        return dog.bark(numberOfSounds);
    }
}
