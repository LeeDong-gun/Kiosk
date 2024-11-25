package challenge_lv1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuType> menu;
    private List<MenuItem> cart;

    public Kiosk(List<MenuType> menu) {
        this.menu = menu;
        this.cart = new ArrayList<>();
    }

    // 시작 메서드
    public void start() {

        Scanner sc = new Scanner(System.in);
        int menuChoice;
        int inputChoice = 0;

        do {
            // 메인 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            // 카테고리 출력
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(i + 1 + ". " + menu.get(i).getName());
            }
            System.out.println("0. 종료");

            // 장바구니가 비었을때 출력 되지않음
            if (!cart.isEmpty()) {
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders     | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel     | 진행중인 주문을 취소합니다.");
            }
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

            do {
                // 선택한 카테고리 메뉴 출력
                select.displayMenuList();

                // 유효성 검사
                try {
                    // 메뉴 선택
                    menuChoice = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }


                MenuItem selectMenu = null;
                //뒤로가기
                switch (menuChoice) {
                    case 1:
                        selectMenu = menu.get(0).getMenuList().get(menuChoice - 1);
                        break;
                    case 2:
                        selectMenu = menu.get(1).getMenuList().get(menuChoice - 1);
                        break;
                    case 3:
                        selectMenu = menu.get(2).getMenuList().get(menuChoice - 1);
                        break;
                    default:
                        System.out.println("유효하지 않은 숫자입니다. 다시 선택해주세요");
                        continue;
                }
                System.out.println("선택한 메뉴: " + selectMenu.getName() + "  | W " + selectMenu.getPrice() + " | " + selectMenu.getComment());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인            2. 취소");


                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        cart.add(selectMenu);
                        System.out.println(select.getName() + "이(가) 장바구니에 추가되었습니다.");
                    case 2:
                        System.out.println("다시 메뉴로 돌아갑니다.");
                        continue;
                }
            } while (false);
        } while (inputChoice != 0);
    }
}
