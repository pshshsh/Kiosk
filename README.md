# Kiosk
프로젝트 개요: 키오스크 시스템을 수준별로 패키지로 나누어 설계한 Java 프로그램 입니다.


레벨 1 : 기본적인 키오스크
- Scanner 를 사용하여 입력을 받아 switch 문 통한 사용해 입력된 번호에 따른 출력 , while 문을 사용해 무한 반복/

레벨 2 :  MenuItem 클래스 추가
- 개별 음식 항목을 관리하기 위해 MenuItem 클래스를 생성
- MenuItem 클래스는 이름, 가격, 설명 필드를 가지며 필드를 접근하기 위해 게터 메서드 정의
- ArrayList 를 사용하여 여러 MenuItem 객체를 관리

레벨 3 : 메인 메서드에서 관리하던 프로그램의 순서 제어를 분리하여 Kiosk 클래스를 통해 관리
- Kiosk 클래스 : 키오스크 프로그램 전체 흐름 관리 및 메뉴 출력, 사용자 입력처리, 종료 작업
- MenuItem 클래스 : 메뉴 아이템 데이터 관리

레벨 4 : 음식 메뉴와 주문 내역을 클래스 기반으로 관리
- Kiosk 클래스: 사용자 입력 처리 및 흐름 제어.
- Menu 클래스: 카테고리별 메뉴 데이터 관리
- MenuItem 클래스: 세부 메뉴 데이터 관리.
