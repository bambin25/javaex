package enumType;

public enum Gender {
  MALE("남성"), FEMALE("여성");
  //MALE,FEMALE;
  // 생성자
  Gender(String name) {
    this.name = name;
  }
  // 필드
  private String name;
  // 메서드
  public String toString() {
    return name;
  }
}