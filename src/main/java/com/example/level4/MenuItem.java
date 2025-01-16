package com.example.level4;

public class MenuItem {
  private String name; // 메뉴 이름 필드
  private int cost; // 가격 필드
  private String ex; // 설명 필드


  //생성자
  public MenuItem(String name, int cost, String ex){
    this.name = name;
    this.cost = cost;
    this.ex = ex;

  }
  //Getter
  public String getName(){
    return name;
  }
  public int getCost() {
    return cost;
  }

  public String getEx() {
    return ex;
  }
  //Setter
  public void setName(String name){
    this.name = name;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  public void setEx(String ex) {
    this.ex = ex;
  }
}

