package hexlet.code;

public class Menu {

    private static Item[] listMenu = new Item[]{new Greet(), new Exit()};

    public static void showMenu() {
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(listMenu[i].getNumItem() + " - " + listMenu[i].getNameItem());
        }
    }

    public static void openGame(int num) {
        for (Item item : listMenu) {
            if (num == item.getNumItem()) {
                item.start();
                break;
            }
        }
    }
}
