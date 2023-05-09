package fr.javagc.test1;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Mem1");

    for (int i = 0; i < 1000; i++) {

      Mem1 mem1 = new Mem1();
      mem1.append(1000);

    }

  }
}
