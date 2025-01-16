package com.example.level5;

public class MenuItem {
  private String name; // 메뉴 이름 변수
  private int cost; // 가격 변수
  private String ex; // 설명 변수

  // 생성자
  public MenuItem(String name, int cost, String ex) {
    this.name = name;
    this.cost = cost;
    this.ex = ex;
  }

  // Getter, Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public String getEx() {
    return ex;
  }

  public void setEx(String ex) {
    this.ex = ex;
  }
}