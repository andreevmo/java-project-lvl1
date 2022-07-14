package hexlet.code.items;

import hexlet.code.items.Item;

public class Exit implements Item {

    private String nameItem = "Exit";
    private int numberItem = 0;

    public final String getNameItem() {
        return this.nameItem;
    }

    public final int getNumItem() {
        return this.numberItem;
    }
}
