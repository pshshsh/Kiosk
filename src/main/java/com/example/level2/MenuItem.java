//MenuItem 클래스 : 메뉴 정보 저장하는 클래스
package com.example.level2;

public class MenuItem {
  private  String name; // 메뉴 이름 필드
  private  int cost; // 가격 필드
  private String ex; // 설명 필드

  // 생성자 : 필드 초기화
  public MenuItem(String name, int cost, String ex){
      this.name = name;
      this.cost = cost;
      this.ex = ex;
  }
  //Getter 메서드 :
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

