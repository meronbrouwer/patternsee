package nl.han.oose.dea.meron.patternsee;

import java.util.stream.IntStream;

public class Dog {

    private static final String BARK = "Woef";

    public String bark(int howMany) {

        var returnValue = new StringBuilder();

        IntStream.range(0, howMany).forEach(value -> returnValue.append(BARK));

        return returnValue.toString();
    }


}
