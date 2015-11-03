public class test extends Thread{
  public static void main (String [] args){
    System.out.println(this.toByteArray());
  }
  
  public static void run(){
    super.run();
  }
}
