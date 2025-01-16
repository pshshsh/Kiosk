package com.example.level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
  private List<MenuItem> menuItems; //메뉴아이템 관리
  private String categoryName; // 카테코리 이름 저장
  //생성자
  public  Menu(String categoryName){
    this.categoryName = categoryName;
    this.menuItems = new ArrayList<>();
  }
  //메뉴 카테고리 이름 반환하는 메서드
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  //메뉴아이템 추가
  public void addMenuItems(MenuItem menuItem){
    menuItems.add(menuItem);
  }
  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  //menuItems 리스트 반환
  public List<MenuItem> getMenuItems() {
    return menuItems;
  }
  // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
  public void displayMenuItems() {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.printf("%d. %s | W %.1f | %s%n",
          i + 1,
          menuItems.get(i).getName(),
          menuItems.get(i).getCost() / 1000.0,
          menuItems.get(i).getEx());
    }

  }
}

