package nl.han.oose.dea.meron.patternsee.controllers;

import nl.han.oose.dea.meron.patternsee.factories.AnimalFactory;
import nl.han.oose.dea.meron.patternsee.factories.AnimalSound;
import nl.han.oose.dea.meron.patternsee.factories.AnimalType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class AnimalSoundController {

    @GET
    @Path("{number}")
    public String makeSound(@PathParam("number") int number) {

        AnimalSound cat = AnimalFactory.getInstance().create(AnimalType.CAT);

        return cat.makeSound(number);
    }
}
