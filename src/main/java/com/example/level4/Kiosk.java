//main에서 관리하던 전체 순서 제어를 Kiosk 클래스를 통해 관리

package com.example.level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
  private List<MenuItem> menuItems; //메뉴아이템 관리하는 리스트

  public Kiosk(List<MenuItem> menuItems) {// MenuItem 객체를 저장하는 List타입을 받아라
    this.menuItems = menuItems;
  }  // List<MeniItem> menuItems을 Kiosk 클래스 생성자를 통해 값을 할당

  //키오스크 프로그램 시작 메서드
  public void start() {
    Scanner sc = new Scanner(System.in);
    int num;
    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");

      for (int i = 0; i < menuItems.size(); i++) {
        System.out.printf("%d. %s | W %.1f | %s%n",
            i + 1,
            menuItems.get(i).getName(),
            menuItems.get(i).getCost() / 1000.0,
            menuItems.get(i).getEx());
      }
      System.out.println("0. 종료");
      System.out.println("번호를 입력해주세요 : ");
      num = sc.nextInt();
      // 입력 받은 번호에 따른 메뉴얼 설정
      if (num == 0) {   // 입력이 0일시에 프로그램 종료
        System.out.println("프로그램을 종료합니다");
        System.exit(0);//프로그램 종료
      } else if (num >= 1 && num <= menuItems.size()) { // 입력이 1이상 최대 번호 이하 각번호의 맞는 정보표시
        System.out.printf("메뉴 이름: %s, 가격: %.1f W, 설명: %s%n",
            menuItems.get(num - 1).getName(),
            menuItems.get(num - 1).getCost() / 1000.0,
            menuItems.get(num - 1).getEx());
      } else {
        System.out.println("입력범위를 넘었습니다.");
      }
    }

  }
}


