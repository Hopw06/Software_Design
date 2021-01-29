package Iterator.model;

import java.util.Hashtable;

public class CafeMenu {
    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable<String, MenuItem> getItems() {
        return menuItems;
    }
}
