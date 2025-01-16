package com.example.level5;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //메뉴츄가
    Menu burgerMenu = new Menu("Burgers");
    burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    burgerMenu.addMenuItem(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));


    Menu drinkMenu = new Menu("Drinks");
    drinkMenu.addMenuItem(new MenuItem("Cider", 2000, "탄산 음료"));
    drinkMenu.addMenuItem(new MenuItem("Orange Juice", 3000, "오렌지를 갈아서 만든 음료"));
    drinkMenu.addMenuItem(new MenuItem("Strawberry Latte", 4000, "딸기를 사용한 부드러운 라떼"));
    drinkMenu.addMenuItem(new MenuItem("Cola", 2000, "탄산이 톡톡 터지는 음료"));


    Menu dessertMenu = new Menu("Desserts");
    dessertMenu.addMenuItem(new MenuItem("Croquette", 3300, "튀긴 빵으로 만든 크로켓"));
    dessertMenu.addMenuItem(new MenuItem("Cake", 18000, "초코 케이크"));
    dessertMenu.addMenuItem(new MenuItem("Ice Cream", 2000, "시원한 아이스크림"));
    dessertMenu.addMenuItem(new MenuItem("Pizza", 15000, "따뜻한 피자 한 판"));

    //메뉴 리스트 생성 및 추가
    List<Menu> menus = new ArrayList<>();
    menus.add(burgerMenu);
    menus.add(drinkMenu);
    menus.add(dessertMenu);

    // kiosk 객체 생성 및 실행
    Kiosk kiosk = new Kiosk(menus);
    kiosk.start();
  }
}