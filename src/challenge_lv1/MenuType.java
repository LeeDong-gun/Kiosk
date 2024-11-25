package challenge_lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuType {
    Scanner sc = new Scanner(System.in);
    private String name;
    private List<MenuItem> menuList;

    // 생성자
    public MenuType(String name) {
        this.name = name;
        this.menuList = new ArrayList<>();
    }

    // 리스트 추가 메서드
    public void addList(MenuItem item) {
        menuList.add(item);
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuList() {
        return menuList;
    }

    // 메뉴아이템 리스트 출력
    public void displayMenuList() {
        System.out.println("[ " + name + "MENU" + " ]");
        for (int i = 0; i < menuList.size(); i++) {
            MenuItem item = menuList.get(i);
            System.out.printf("%d. %-17s| W %.1f | %s%n", i + 1, item.getName(), item.getPrice(), item.getComment());
        }
        System.out.println("0. 뒤로가기");
    }


}
