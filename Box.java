 // cReating class

class Box {
    private int length, breadth, height;
    public void setDimension(int c, int b, int h) 
    { length=c ; breadth=b; height=h;}
    public void showDimension() 
    { System.out.println("L="+ length);
      System.out.println("B="+ breadth);
      System.out.println("H="+ height);  
      }
}
// creating Object to show results 
class Example {
 public static void main() {
     Box smallBox= new Box();
     smallBox.setDimension(12, 10, 5);
     smallBox.showDimension();
     
 }
}