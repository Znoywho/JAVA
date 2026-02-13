public class MultByTwo {
  public static void main(String[] args) {
    int i ;
    int num = 0xffffffe;
    // num will be shifted left 4-bit position 
    for (i = 0; i < 4; i++) {
      num = num << 1;
      System.out.println(num);
    }
  }
}
