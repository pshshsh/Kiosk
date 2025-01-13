package com.example.level3;

public class MenuItem {
  private String name; // 메뉴 이름 필드
  private int cost; // 가격 필드
  private String ex; // 설명 필드



  MenuItem(String name, int cost, String ex){
    this.name = name;
    this.cost = cost;
    this.ex = ex;

  }

  public String getName(){
    return name;
  }
  public int getCost() {
    return cost;
  }

  public String getEx() {
    return ex;
  }
}
