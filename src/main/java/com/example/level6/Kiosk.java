package com.example.level6;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
  private List<Menu> menus;// menu 객체들의 목록 저장 필드
  private Cart cart; // cart 객체 저장 필드

  public Kiosk(List<Menu> menus) { // 생성자

    this.menus = menus; // 전달받은 menus 리스트를 Kiosk의 menus 필드에 저장
    this.cart = new Cart(); //장바구니 초기화
  }
  // Getter, Setter
  public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }

  // 키오스크 프로그램 시작 메서드
  public void start() {
    Scanner sc = new Scanner(System.in);
    int num ;
    int num2 ;

    while (true) {
      // 메인 메뉴 출력
      System.out.println("[ MAIN MENU ]");
      for (int i = 0; i < menus.size(); i++) {
        System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
      }
      System.out.println("0. 종료");

      if(cart.isEmptyCart() == false){
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Orders    | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel    | 진행중인 주문을 취소합니다.");
      }
      System.out.print("번호를 입력해주세요: ");
      num = sc.nextInt();
      // 0입력시 종료 처리
      if (num == 0) {
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
      }
      // 입력 범위 제한(카트가 비어있지 않으면 메뉴 4,5도 출력해야되기때문에 +2)
      int menuSize = cart.isEmptyCart() ? menus.size() : menus.size() + 2;
      if (num < 1 || num > menuSize) {
        System.out.println("입력 범위를 넘었습니다");
        continue;
      }
      // 주문 하면 displayCart()메서드 불러오기
      if (num == 4) {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println(" [Orders]");
        cart.displayCart();

        System.out.println("1. 주문      2. 메뉴판");
        System.out.print("번호를 입력해주세요: ");
        int num3 = sc.nextInt();
        if (num3 == 1) {
          System.out.println("주문이 완료되었습니다. 금액은 W " + cart.totalPrice() + " 입니다." );
          cart.clearCart(); // 장바구니 초기화
        } else {
          System.out.println("메뉴판으로 돌아갑니다.");
        }
        continue;
      }
      // 주문 취소하면 celarCart()메서드 불러와서 장바구니 초기화
      if (num == 5) {
        System.out.println("장바구니가 초기화됩니다");
        cart.clearCart();
        continue;
      }



      // 선택한 카테고리 출력
      System.out.printf("[ %s MENU ]%n", menus.get(num - 1).getCategoryName());
      menus.get(num - 1).displayMenuItems();
      System.out.println("0. 뒤로가기");

      System.out.print("번호를 입력해주세요: ");
      num2 = sc.nextInt();

      // 뒤로가기 처리
      if (num2 == 0) {
        continue;
      }

      // 잘못 입력 시
      if (num2 < 1 || num2 > menus.get(num - 1).getMenuItems().size()) {
        System.out.println("입력범위를 넘었습니다 다시입력해주세요.");
        continue;
      }

      // 선택한 메뉴 출력
      System.out.printf("선택한 메뉴: %s | W %.1f | %s%n",
          menus.get(num - 1).getMenuItems().get(num2 - 1).getName(),
          menus.get(num - 1).getMenuItems().get(num2 - 1).getCost() / 1000.0,
          menus.get(num - 1).getMenuItems().get(num2 - 1).getEx());
      System.out.println("위 메뉴를 장바구니에 추가 하시겠습니까?");
      System.out.println("1. 확인     2. 취소");
      int num3 = sc.nextInt();
      // 1.확인을 누르면 나오는 메뉴
      if(num3 == 1){
        System.out.println( menus.get(num - 1).getMenuItems().get(num2 - 1).getName() + "이 장바구니에 추가되었습니다. ");
        cart.addCart(menus.get(num - 1).getMenuItems().get(num2 - 1));
      continue;
      }
      // 2. 취소를 누르면 다시 메뉴판으로 돌아가도록 함
      if(num == 2){
        System.out.println("메뉴판으로 돌아갑니다");
        continue;
      }
    }
  }
}
