import java.io.*;

public class Probrem57{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
      int n = Integer.parseInt(line);

      switch (n) {
        case 0:
          System.out.println("日曜日");
          break;

        case 1:
          System.out.println("月曜日");
          break;

        case 2:
          System.out.println("火曜日");
          break;

        case 3:
          System.out.println("水曜日");
          break;

        case 4:
          System.out.println("木曜日");
          break;

        case 5:
          System.out.println("金曜日");
          break;

        case 6:
          System.out.println("土曜日");
          break;

        default:
          System.out.println("０〜６の範囲を入力してください。");
          break;
      }
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("入力が不正です。");
    }
  }
}