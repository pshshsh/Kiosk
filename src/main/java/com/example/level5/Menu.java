package com.example.level5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
  private List<MenuItem> menuItems; // 메뉴 리스트
  private String categoryName; // 카테고리 이름

  // 생성자
  public Menu(String categoryName) {
    this.categoryName = categoryName;
    this.menuItems = new ArrayList<>();
  }

  // Getter,Setter
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  // 메뉴 아이템 추가
  public void addMenuItem(MenuItem menuItem) {
    this.menuItems.add(menuItem);
  }
}