package lv4;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Kiosk {
    public List<MenuType> menu;

    public void start (){
        Scanner sc = new Scanner(System.in);

        int menuChoice;

        System.out.println("[ MAIN MENU ]");

        // 카테고리 출력
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i).getName() );
        }
        System.out.println("0. 종료");
        System.out.println("카테고리 및 종료를 선택해주세요.");

        int inputChoice;

        // 유효성 검사
        try {
        //카테고리 및 종료 입력받기
        inputChoice = sc.nextInt();
        sc.nextLine();
        }catch(InputMismatchException e) {
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
        int select = inputChoice - 1;
        System.out.println();


    }
}
