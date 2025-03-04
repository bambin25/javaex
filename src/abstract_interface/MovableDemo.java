package abstract_interface;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(5);
    //m.show();
    // downCasting , 강제 형변환 , 기능을 되돌리기
    Car car = (Car)m;
    car.move(3);
    car.move(5);
    car.show();
  }
}
