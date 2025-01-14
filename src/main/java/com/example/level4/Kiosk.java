package com.example.level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
  private List<Menu> menus; // menu 객체들의 목록 저장 필드

  public Kiosk(List<Menu> menus) { // 생성자
    this.menus = menus; // 전달받은 menus 리스트를 Kiosk의 menus 필드에 저장
  }

  // 키오스크 프로그램 시작 메서드
  public void start() {
    Scanner sc = new Scanner(System.in);
    int num ;
    int num2 ;

    while (true) {
      // 메인 메뉴 출력
      System.out.println("[ MAIN MENU ]");
      for (int i = 0; i < menus.size(); i++) {
        System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
      }
      System.out.println("0. 종료");
      System.out.print("번호를 입력해주세요: ");

      num = sc.nextInt();
      // 0입력시 종료 처리
      if (num == 0) {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
      }
      // 잘못 입력 시
      if (num < 1 || num > menus.size()) {
        System.out.println("입력범위를 넘었습니다 다시입력해주세요.");
        continue;
      }

      // 선택한 카테고리 출력
      System.out.printf("[ %s MENU ]%n", menus.get(num - 1).getCategoryName());
      menus.get(num - 1).displayMenuItems();
      System.out.println("0. 뒤로가기");

      System.out.print("번호를 입력해주세요: ");
      num2 = sc.nextInt();

      // 뒤로가기 처리
      if (num2 == 0) {
        continue;
      }

      // 잘못 입력 시
      if (num2 < 1 || num2 > menus.get(num - 1).getMenuItems().size()) {
        System.out.println("입력범위를 넘었습니다 다시입력해주세요.");
        continue;
      }

      // 선택한 메뉴 출력
      System.out.printf("선택한 메뉴: %s | W %.1f | %s%n",
          menus.get(num - 1).getMenuItems().get(num2 - 1).getName(),
          menus.get(num - 1).getMenuItems().get(num2 - 1).getCost() / 1000.0,
          menus.get(num - 1).getMenuItems().get(num2 - 1).getEx());
    }
  }
}
