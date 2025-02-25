import java.util.Arrays;

public class ArrayDemo4 {
  public static void main(String[] args) {
    String[] names = new String[3];
    System.out.println(Arrays.toString(names));
    names[0] = "kim";
    for (int i = 0; i < names.length; i++) {
//      if (names[i]==null) {
//        System.out.println(0);
//      } else {
//        System.out.println(names[i].length());
//      }

      if( names[i] != null && names[i].length() > 0 ) {
        System.out.println(names[i].length());
      }
    }
    System.out.println(Arrays.toString(names));
    names[1] = "";
    System.out.println(Arrays.toString(names));
    for (int i = 0; i < names.length; i++) {
      if( names[i] != null && names[i].length() > 0 ) {
        System.out.println(names[i].length());
      }
    }
    names[2] = "park";
    System.out.println(Arrays.toString(names));


  }
}
