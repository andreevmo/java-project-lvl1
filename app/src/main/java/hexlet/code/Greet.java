package hexlet.code;

public class Greet implements Item {

    private final String name = "Greet";
    private final int numItem = 1;

    @Override
    public void start() {
        Cli.makeWelcome();
        finish();
    }

    public int getNumItem() {
        return numItem;
    }

    public String getNameItem() {
        return name;
    }

    @Override
    public void finish() {
        App.setIsOn(false);
    }
}
