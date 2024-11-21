package lv1;

import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menuChoice;

        /**
          반복시키기
          0이 입력되면 do while문을 빠져나가 반복이 종료됨
         */
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger     | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack      | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. CheeseBurger    | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger       | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");
            System.out.println("메뉴 및 종료를 선택해주세요.");

            // 입력받기
            menuChoice = sc.nextLine();

            // 입력받은 숫자에 따라 처리하기
            switch (menuChoice) {
                case "1":
                    System.out.println("1. ShackBurger를 선택했습니다.");
                    break;
                case "2":
                    System.out.println("2. SmokeShack를 선택했습니다.");
                    break;
                case "3":
                    System.out.println("3. CheeseBurger를 선택했습니다.");
                    break;
                case "4":
                    System.out.println("4. Hamburger를 선택했습니다.");
                    break;
                case "0":
                    System.out.println("0. 종료를 선택했습니다.");
                    System.out.println("키오스크를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴 입니다, 다시 선택해주세요.");
            }
            System.out.println();
        } while (!menuChoice.equals("0"));
    }
}

