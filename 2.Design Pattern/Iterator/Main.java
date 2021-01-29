package Iterator;

import Iterator.model.DinnerMenu;
import Iterator.model.Menu;
import Iterator.model.PancakeHouseMenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinnerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
