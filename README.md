# qaa_dz_01

public class Dz01 {
  public static void main(String[] args) {
    String str = args[0];

    String result = "";

    for (int i = str.length()-1; i >= 0; i--){
      result += str.charAt(i);
    }

    // System.out.println(str);
    System.out.println(result);
  }
}
