package lv5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 버거 카테고리 및 버거 메뉴 생성
        MenuType burger = new MenuType("Burger");
        burger.addList(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burger.addList(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burger.addList(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가토핑된 치즈버거"));
        burger.addList(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 카테고리 및 음료 메뉴 생성
        MenuType drink = new MenuType("Drink");
        drink.addList(new MenuItem("Cola", 2.0, "코카콜라"));
        drink.addList(new MenuItem("Zero-Cola", 2.5, "제로 코카콜라"));
        drink.addList(new MenuItem("Sprite", 2.0, "사이다"));
        drink.addList(new MenuItem("Zero-Sprite", 2.5, "제로 사이다"));

        // 디저트 카테고리 및 디저트 메뉴 생성
        MenuType dessert = new MenuType("Dessert");
        dessert.addList(new MenuItem("Coleslaw", 2.5, "잘게 채썬 양배추에 비네그레트 드레싱"));
        dessert.addList(new MenuItem("French fries", 2.5, "감자튀김"));
        dessert.addList(new MenuItem("Cheese Sticks", 3.6, "모짜렐라 치즈가 들어간 치즈스틱 2EA"));

        List<MenuType> type = new ArrayList<>();
        type.add(burger);
        type.add(drink);
        type.add(dessert);

        Kiosk start = new Kiosk(type);
        start.start();
    }
}
