package lv4;

import java.util.ArrayList;
import java.util.List;

public class MenuType {
    public String name;
    public List<MenuItem> menuList;

    // 생성자
    public MenuType (String name) {
        this.name = name;
        this.menuList = new ArrayList<>();
    }

    // 메뉴 리스트 출력
    public void displayMenuList() {
        System.out.println(this.name);
        for (int i = 0; i <= menuList.size(); i++) {
            MenuItem item = menuList.get(i);
            System.out.printf("%d. %-17s| W %.1f | %s%n", i+1, item.name, item.price, item.comment);
        }
    }

    // 리스트 추가 메서드
    public void addList (MenuItem item) {
        menuList.add(item);
    }

    public String getName () {
        return name;
    }
}
