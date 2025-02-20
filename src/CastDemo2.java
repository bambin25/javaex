public class CastDemo2 {
  public static void main(String[] args) {
    String strInt = "20";
    int i= Integer.parseInt(strInt);
    System.out.println(i + 1);

    String strDouble = "20.001";
    double v = Double.parseDouble(strDouble);
    System.out.println(v + 1);

    String strFloat = "3.14f";
    float f = Float.parseFloat(strFloat);
    System.out.println(f);


  }
}
