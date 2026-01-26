public class FindPrime {
  public static void main(String[] args) {
   int num;
   boolean isPrime = false;
   num = 14;
   if(num < 2) isPrime = false;
   for (int i = 2; i < Math.sqrt(num); i++) {
    if (num%i==0) {
      isPrime = false;
      break;
    }
   }
   if (isPrime) {
    System.out.println("PRIME");
   } else {
    System.out.println("NOT PRIME");
   }
  }
}
