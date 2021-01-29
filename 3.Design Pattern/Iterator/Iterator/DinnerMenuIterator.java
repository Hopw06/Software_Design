package Iterator.Iterator;


import Iterator.model.MenuItem;

public class DinnerMenuIterator extends Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.menuItems = items;
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    @Override
    public boolean hasNext() {
       return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return  menuItem;
    }
}
