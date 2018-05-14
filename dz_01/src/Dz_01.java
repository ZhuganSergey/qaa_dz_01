public class Dz_01 {
  public static void main(String[] args) {
    String str = args[0];

    String result = "";

    for (int i = str.length()-1; i >= 0; i--){
      result = result + str.charAt(i) + " ";
    }

    result = result.trim();

    System.out.println(result);
  }
}

// 