package lv5;

public class MenuItem {
    private String name;
    private double price;
    private String comment;

    // 이름 불러오기
    public String getName() {
        return name;
    }

    // 가격 불러오기
    public double getPrice() {
        return price;
    }

    // 코멘트 불러오기
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
