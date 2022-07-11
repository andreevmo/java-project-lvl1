package hexlet.code;

public class Exit implements Item {

    private final String name = "Exit";
    private final int numItem = 0;

    @Override
    public void start() {
        finish();
    }

    public String getNameItem() {
        return name;
    }

    @Override
    public void finish() {
        App.setIsOn(false);
    }

    public int getNumItem() {
        return numItem;
    }
}
