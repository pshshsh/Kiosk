package com.example.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<MenuItem> menuItems = new ArrayList<>(); //MenuItem 객체를 저장하는 리스트
    //메뉴츄가 : MenuItem 객체를 생성
    MenuItem shackBurger = new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    menuItems.add(shackBurger); // 리스트에 메뉴 추가
    MenuItem smokeShack = new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    menuItems.add(smokeShack);
    MenuItem cheeseburger = new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
    menuItems.add(cheeseburger);
    MenuItem hamburger = new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거");
    menuItems.add(hamburger);
    Scanner sc = new Scanner(System.in);
    int num;
    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");

      for(int i = 0; i < menuItems.size(); i++ ){
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
      }
      if (num >= 1 && num <= menuItems.size()) { // 입력이 1이상 최대 번호 이하 각번호의 맞는 정보표시
        System.out.printf("메뉴 이름: %s, 가격: %.1f W, 설명: %s%n",
            menuItems.get(num).getName(),
            menuItems.get(num).getCost() / 1000.0,
            menuItems.get(num).getEx());
      }
      }
      }
    }

