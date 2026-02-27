class Box{
  double width;
  double deth;
  double height;
}

public class BoxDemo {
  public static void main(String[] args) {
    Box mybox = new Box();
    double vol;
    mybox.width = 10;
    mybox.height = 20;
    mybox.deth = 15;

    vol = mybox.width * mybox.height * mybox.deth;
    System.out.println("Volumne is " + vol);

    
  }
}
