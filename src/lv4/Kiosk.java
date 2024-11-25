package lv4;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public List<MenuType> menu;

    public Kiosk(List<MenuType> menu) {
        this.menu = menu;
    }

    // 시작 메서드
    public void start() {

        Scanner sc = new Scanner(System.in);

        int inputChoice = 0;

        do {
            System.out.println("[ MAIN MENU ]");

            // 카테고리 출력
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + 1 + ". " + menu.get(i).getName());
            }
            System.out.println("0. 종료");
            System.out.println("카테고리 및 종료를 선택해주세요.");

            // 유효성 검사
            try {
                //카테고리 및 종료 입력받기
                inputChoice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            //종료 조건
            if (inputChoice == 0) {
                System.out.println("키오스크를 종료합니다.");
                break;
            } else if (inputChoice < 1 || inputChoice > menu.size()) {
                System.out.println("유효하지 않은 숫자입니다. 다시 입력해주세요");
                continue;
            }
            MenuType select = menu.get(inputChoice - 1);
            System.out.println(select.getName() + " 선택창으로 넘어갑니다.");

            // 선택한 카테고리 메뉴 출력
            select.displayMenuList();


        } while (inputChoice != 0);
    }
}
