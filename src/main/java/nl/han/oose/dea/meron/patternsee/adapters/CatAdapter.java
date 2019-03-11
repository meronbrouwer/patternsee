package nl.han.oose.dea.meron.patternsee.adapters;

import nl.han.oose.dea.meron.patternsee.Cat;
import nl.han.oose.dea.meron.patternsee.factories.AnimalSound;

public class CatAdapter implements AnimalSound {

    @Override
    public String makeSound(int numberOfSounds) {

        Cat cat = new Cat();

        return cat.miauw(numberOfSounds);
    }
}
