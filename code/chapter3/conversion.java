public class conversion {
  public static void main(String[] args) {
    byte b;
    int i = 257;
    double d = 200.343;
    b = (byte) i;
    System.out.println("Conversion of int to byte: " + i + "-> " + b);
    i = (int) d;
    System.out.println("Conversion of double to int: " + d + "-> " + i);
    b = (byte) d;
    System.out.println("Conversion of double to byte: " + d + " -> " + b);

  }
}
