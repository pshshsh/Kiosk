package com.example.level6;
//이넘 상수 지정
public enum Job {
  VETERAN(10),
  SOLDIER(5),
  STUDENT(3),
  GENERAL(0);
  private final int discountRate;
  Job(int discountRate) {
    this.discountRate = discountRate;
  }
  public int getDiscountRate(){
    return discountRate;
  }
}