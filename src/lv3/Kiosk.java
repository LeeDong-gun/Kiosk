package lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Kiosk 함수
 * 전반적인 순서를 실행 시키는 함수
 */
public class Kiosk {
    public void kio() {
        Scanner sc = new Scanner(System.in);
        int menuChoice;

        //리스트 선언
        List<MenuItem> menuItems = new ArrayList<>();

        //햄버거(메뉴리스트) 객체 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        /**
         반복시키기
         0이 입력되면 do while문을 빠져나가 반복이 종료됨
         */
        do {
            /**
             * 메뉴출력
             * List에 추가한 메뉴들을 for문으로 메뉴를 나열
             */
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. %-17s| W %.1f | %s%n", i+1, menuItems.get(i).burgerName, menuItems.get(i).price, menuItems.get(i).comment);
            }
            System.out.println("0. 종료");
            System.out.println("메뉴 및 종료를 선택해주세요.");

            // 입력받기
            menuChoice = sc.nextInt();
            sc.nextLine();

            // 출력을 위한 변수 선언
            int select = menuChoice - 1;

            // 입력받은 숫자에 따라 처리하기
            switch (menuChoice) {
                case 1:
                    System.out.println("선택한 메뉴: " + menuItems.get(select).burgerName);
                    System.out.println("가격: " + menuItems.get(select).price);
                    System.out.println("조리법: " + menuItems.get(select).comment);
                    break;
                case 2:
                    System.out.println("선택한 메뉴: " + menuItems.get(select).burgerName);
                    System.out.println("가격: " + menuItems.get(select).price);
                    System.out.println("조리법: " + menuItems.get(select).comment);
                    break;
                case 3:
                    System.out.println("선택한 메뉴: " + menuItems.get(select).burgerName);
                    System.out.println("가격: " + menuItems.get(select).price);
                    System.out.println("조리법: " + menuItems.get(select).comment);
                    break;
                case 4:
                    System.out.println("선택한 메뉴: " + menuItems.get(select).burgerName);
                    System.out.println("가격: " + menuItems.get(select).price);
                    System.out.println("조리법: " + menuItems.get(select).comment);
                    break;
                case 0:
                    System.out.println("0. 종료를 선택했습니다.");
                    System.out.println("키오스크를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴 입니다, 다시 선택해주세요.");
            }
            System.out.println();
        } while (menuChoice != 0);
    }
}
