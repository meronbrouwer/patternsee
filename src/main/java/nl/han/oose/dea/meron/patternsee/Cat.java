package nl.han.oose.dea.meron.patternsee;

public class Cat {

    private static final String MIAUW = "Miauw";

    public String miauw(int howMany) {

        StringBuilder returnValue = new StringBuilder();

        for (int i = 0; i < howMany; i++) {
            returnValue.append(MIAUW);
        }

        return returnValue.toString();
    }
}
