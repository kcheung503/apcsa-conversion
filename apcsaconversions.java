import java.util.Scanner;

public class apcsarighttriangle {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      final double IN_TO_MI = 63360;
      final double FEET_TO_MI = 5280;
      final double YARD_TO_MI = 1760;

      System.out.print("Enter an origin unit: ");
      char origin = in.nextChar();

      System.out.print("Enter a destination unit: ");
      char destination = in.nextChar();

      System.out.print("Enter a value: ");
      double value = in.nextDouble();

      double finalValue = value * origin;

      System.out.println("There are " + destination + "in 2.0 miles.);
      in.close();
    }
}
