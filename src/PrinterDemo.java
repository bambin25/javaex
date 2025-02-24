public class PrinterDemo {
  public static void main(String[] args) {
    // 메소드 오버로딩

    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");

  }

}

class Printer {
  // 생성자
  // 메서드 (void, println, value(int,double, boolean, String
  public void println(int value) {
    System.out.println("value = " + value);
  }

  public void println(boolean value) {
    System.out.println("value = " + value);
  }

  public void println(double value) {
    System.out.println("value = " + value);
  }

  public void println(String value) {
    System.out.println("value = " + value);
  }

}
