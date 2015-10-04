import java.io.*;

public class Probrem32 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String name1 = reader.readLine();
      String line = reader.readLine();
      int age1 = Integer.parseInt(line);

      String name2 = reader.readLine();
      line = reader.readLine();
      int age2 = Integer.parseInt(line);

      System.out.println((double)(age1 + age2) / 2);
    } catch(IOException e){
      System.out.println(e);
    } catch (NumberFormatException e){
      System.out.println("入力が不正です。");
    }
  }
}