package com.example.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //메뉴츄가
    Menu burgerMenu = new Menu("Burgers");
    burgerMenu.addMenuItems(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    burgerMenu.addMenuItems(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    burgerMenu.addMenuItems(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    burgerMenu.addMenuItems(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

    Menu drinkMenu = new Menu("Drinks");
    drinkMenu.addMenuItems(new MenuItem("cider",2000, "탄산 음료"));
    drinkMenu.addMenuItems(new MenuItem("orange juice",3000, "오렌지를 갈아서 만든 음료"));
    drinkMenu.addMenuItems(new MenuItem("Strawberry Latte",2000, "맛있는 딸기 음료"));
    drinkMenu.addMenuItems(new MenuItem("cider",2000, "탄산 음료"));

    Menu dessertsMenu = new Menu("Desserts");
    dessertsMenu.addMenuItems(new MenuItem("Croquette",3300, "튀긴 빵"));
    dessertsMenu.addMenuItems(new MenuItem("cake",18000, "달달한 초코 케이크"));
    dessertsMenu.addMenuItems(new MenuItem("ice cream",2000, "아이스크림"));
    dessertsMenu.addMenuItems(new MenuItem("pizza",2000, "피자"));

    List<Menu> menus = new ArrayList<>();
    menus.add(burgerMenu);
    menus.add(drinkMenu);
    menus.add(dessertsMenu); //메뉴를 리스트에 추가


    Kiosk kiosk = new Kiosk(menus); // menus 리스트를 Kiost 클래스 생성자에 전달
    kiosk.start();
  }
}


