import java.util.Scanner;

public class First {
public static void main (String[] args) {
   Scanner read = new Scanner(System.in);
   int i = read.nextInt();
   read.nextLine();
   Double d = read.nextDouble();
   read.nextLine();
   String s = read. nextLine();

        // Write your code here.

      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
   read.close();
   }
}