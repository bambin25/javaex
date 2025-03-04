package exercise.chapter7;

public class ex3_2 {
  public static void main(String[] args) {
    Triangle t1= new Triangle(10,5);
    Triangle t2= new Triangle(5,10);
    int res = t1.compareTo(t2);

    // 결과가 넓이가 같다.
    if (res == -888){
      System.out.println("넓이를 비교할 수 없습니다.");
    } else {
      if (res > 0 ) {
        System.out.println("t1"+t1+"의 넓이가 더 큽니다.");
      } else if(res < 0 ) {
        System.out.println("t2"+t2+"의 넓이가 더 큽니다.");
      } else {
        System.out.println("두 삼각형의 넓이가 같습니다.");
      }
    }

  }
}

class Triangle implements Comparable {
  int height;
  int width;

  public Triangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public int compareTo(Object o) {
    int result = -888;
    if(o instanceof Triangle t) {
      if(this.getArea() > t.getArea()) return result = 1;
      else if(this.getArea() < t.getArea()) return result = -1;
      else result = 0;
    }
    return result;
  }

  private double getArea() {
    return (height * width)/ (double)2 ;
  }

  @Override
  public String toString() {
    return "["+
        "넓이:"+getArea()+
        ']';
  }
}
