package challenge_lv1;

public class MenuItem {
    private String name;
    private double price;
    private String comment;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getComment() {
        return comment;
    }

    //생성자
    public MenuItem(String name, double price, String comment) {
        this.name = name;
        this.price = price;
        this.comment = comment;
    }

}
