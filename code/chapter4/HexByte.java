public class HexByte {
  public static void main(String[] args) {
    char Hex[] = {
      '0','1','2','3','4','5','6','7','8','9',
      'a','b','c','d','e','f'
    }
    byte b = (byte) 0xf1;// = 1111 0001
    System.out.println("b = 0x" + Hex[(b >> 4 )& 0x0f] + Hex[b & 0x0f]);
  // b >> 4 = 0000 1111
  // & 0000 1111
  // => 0000 1111 
  // b = 1111 0001
  // &
  // 0x0f = 0000 1111
  // => 0000 0001
  }
}
