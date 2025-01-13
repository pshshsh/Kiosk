package com.example.level3;
import java.util.ArrayList;
import java.util.List;


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
    // kiosk 객체 생성
    Kiosk kiosk = new Kiosk(menuItems);
    kiosk.start(); //키오스크 시작
  }
}