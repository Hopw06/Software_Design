package Iterator.model;

public class MenuItem {
    String name;
    String description;
    boolean vegetatian;
    double price;

    public MenuItem(String name, String description, boolean vegetatian, double price) {
        this.name = name;
        this.description = description;
        this.vegetatian = vegetatian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetatian() {
        return vegetatian;
    }

    public void setVegetatian(boolean vegetatian) {
        this.vegetatian = vegetatian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
