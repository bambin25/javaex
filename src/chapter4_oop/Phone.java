package chapter4_oop;

class Phone {
  // 가격, 모델 ==> 필드
  int value; // 단위가 만원
  String model;
  // 정보 출력 ==> 메서드
  void print(){
    System.out.println(value + "만원 짜리 " + model + " 스마트폰");
  }


}
