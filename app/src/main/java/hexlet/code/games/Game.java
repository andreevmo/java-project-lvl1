package hexlet.code.games;

import hexlet.code.Engine;

public interface Game {


    String getRULE();
    int getNumItem();
    String getNameItem();

    default String generateExpression(String question) {
        return question + Engine.generate();
    }

    String getResult(String question);
}
