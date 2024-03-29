import java.util.Scanner;

public class Exercise5BetterDocumentationPrinter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      boolean isBlockComment = false;

      while (scanner.hasNextLine()) {
      String str = scanner.nextLine().trim();
      
      if(isBlockComment || str.contains("/*")) {
      int start = str.indexOf("/*");
      int end = str.indexOf("*/");
      
      if(start >= 0 && end < 0) {
      System.out.println(str.substring(start));
      isBlockComment = true;
      }
      else if(start < 0 && end >= 0) {
      System.out.println(str.substring(end));
      isBlockComment = false;
      }
      else if(start >= 0 && end >= 0) {
      System.out.println(str.substring(0, end + 2));
      isBlockComment = false;
      }
      }
      else if(str.startsWith("//")) {
      System.out.println(str);
      }
      }
      
}
}