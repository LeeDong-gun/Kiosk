package lv3;

// 햄버거 메뉴
public class MenuItem {
    public String burgerName;
    public double price;
    public String comment;

    public MenuItem (String burgerName, double price, String comment) {
        this.burgerName = burgerName;
        this.price = price;
        this.comment = comment;
    }
}