public class ByteUShift {
  public static void main(String[] args) {
    char Hex[] = {
      '0','1','2','3','4','5','6','7','8','9',
      'a','b','c','d','e','f'
    };

    byte b = (byte) 0xf1; // 1111 0001
    byte c = (byte) (b >> 4); // 0000 1111
    byte d = (byte) (b >>> 4);
    byte e = (byte) ((b& 0xff) >> 4);

    System.out.println("b = 0x"
        + Hex[(b>>4) & 0x0f] + Hex[b & 0x0f]
        );
    System.out.println(b >> 4 = 0x
        + Hex[(c>>4) & (0x0f)] + Hex[c & 0x0f]
        );
    System.out.println("b >>> 4 = 0x"
        + Hex[(d >> 4) & 0x0f] + Hex[d & 0x0f]
        );
    System.out.println("(byte) ((b & 0xff) >> 4) = 0x"
        + Hex[(e >> 4) & 0x0f] + Hex[e & 0x0f]
        );

  }
}
