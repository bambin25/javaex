package data_structure;

public class Test {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int result1 = calculator.add(5,3);
    int result2 = calculator.multiply(4,6);
    System.out.println(result1+",");
    System.out.print(result2);
  }
}

class Calculator {
  public static int add(int a,int b){
    return a+b;
  }
  int multiply(int a,int b){
    return a*b;
  }
}