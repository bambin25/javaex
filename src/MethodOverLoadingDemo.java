public class MethodOverLoadingDemo {
  public static void main(String[] args) {
//    getAdd2Numbers(1,2);
//    getAdd3Numbers(1,2,3);
//    getAdd4Numbers(1,2,3,4);
    addNumbers(1,2);
    addNumbers(1000L,2000L);
    addNumbers(1.0,2.0);


  }

  private static void addNumbers(int... numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }

    System.out.println(result);
  }

  private static void addNumbers(long... numbers) {
    int result = 0;
    for (long number : numbers) {
      result += number;
    }

    System.out.println(result);
  }

  private static void addNumbers(double... numbers) {
    double result = 0.0;
    for (double number : numbers) {
      result += number;
    }

    System.out.println(result);
  }


}
