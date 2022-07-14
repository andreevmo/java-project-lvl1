package hexlet.code.items.games;

import hexlet.code.items.Item;

public interface Game extends Item {

    void greet();
    void generate();
    void ask();
    void getAnswer();
    boolean checkAnswer();

}
