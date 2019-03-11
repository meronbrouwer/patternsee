package nl.han.oose.dea.meron.patternsee.factories;

import nl.han.oose.dea.meron.patternsee.adapters.CatAdapter;
import nl.han.oose.dea.meron.patternsee.adapters.DogAdapter;

public class AnimalFactory {

    private static AnimalFactory factory;

    public static AnimalFactory getInstance(){
        if (factory == null){
            factory = new AnimalFactory();
        }
        return factory;
    }

    public AnimalSound create(AnimalType type) {
        switch (type) {
            case CAT:
                return new CatAdapter();
            default:
                return new DogAdapter();
        }
    }
}
