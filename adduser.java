import java.util.Scanner;
public class adduser {
  public static void main(String[] arg) {
    String[] username = {
      "Sun",
      "Moon",
      "Star",
      "Moon"
    };
    int count = 0;
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    for (int i = 0; i < username.length; i++) {
      if (username[i].equals(a))
        count = count + 1;

    }
    if (count == 0) {
      System.out.println("This username isn't in the array");
    } else {
      System.out.println(count);
    }
  }
}
