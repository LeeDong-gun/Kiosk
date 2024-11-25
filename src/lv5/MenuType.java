package lv5;

import java.util.ArrayList;
import java.util.InputMismatchException;
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

    // 메뉴아이템 리스트 출력
    public void displayMenuList() {

        int menuChoice = 0;

        do {
            System.out.println("[ " + name + "MENU" + " ]");
            for (int i = 0; i < menuList.size(); i++) {
                MenuItem item = menuList.get(i);
                System.out.printf("%d. %-17s| W %.1f | %s%n", i + 1, item.getName(), item.getPrice(), item.getComment());
            }
            System.out.println("0. 뒤로가기");

            // 유효성 검사
            try {
                // 메뉴 선택
                menuChoice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            //뒤로가기
            if (menuChoice == 0) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            } else if (menuChoice < 1 || menuChoice > menuList.size()) {
                System.out.println("유효화지 않은 숫자입니다. 다시 입력해주세요.");
                continue;
            }

            MenuItem selectMenu = menuList.get(menuChoice - 1);
            System.out.println("선택한 메뉴: " + selectMenu.getName() + "  | W " + selectMenu.getPrice() + " | " + selectMenu.getComment());
            System.out.println();
        } while (false);
    }


}
