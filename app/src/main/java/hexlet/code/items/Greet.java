package hexlet.code.items;

import hexlet.code.items.Item;

public class Greet implements Item {

    private String nameItem = "Greet";
    private int numberItem = 1;

    public final int getNumItem() {
        return this.numberItem;
    }

    public final String getNameItem() {
        return this.nameItem;
    }

}
