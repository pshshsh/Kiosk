/* 햄버거 메뉴 출렻 및 선택*/
package com.example.level1;

import com.example.level2.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<MenuItem> menuItemList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int num;
    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");
      System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
      System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
      System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
      System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
      System.out.println("0. 종료      | 종료");
      System.out.println("번호를 입력해주세요 : ");
      num = sc.nextInt();
      switch (num) {
        case 0:
          System.out.println("프로그램을 종료합니다");
          System.exit(0);//프로그램 종료
        case 1:
          System.out.println("ShackBurger를 선택하셨습니다.");
          break;
        case 2:
          System.out.println("SmokeShack를 선택하셨습니다.");
          break;
        case 3:
          System.out.println("Cheeseburger를 선택하셨습니다.");
          break;
        case 4:
          System.out.println("Hamburger를 선택하셨습니다.");
          break;
      }
    }
  }
}