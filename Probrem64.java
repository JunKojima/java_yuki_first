public class Probrem64 {
  public static void main(String[] args) {
    for ( int i = 1; i < 10 ; i++) {
      String result = "";
      for (int j = 1; j < 10; j++ ) {
        result = result + i + "*" + j + "=" + (i * j) + ",";
      }
      System.out.println(result);
    }
  }
}