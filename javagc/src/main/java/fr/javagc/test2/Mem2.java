
package fr.javagc.test2;

import java.util.Map;

public class Mem2 {

  public final String key;

  public Mem2(String key) {
    this.key = key;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("Start");
    try {

      Map map = System.getProperties();
      int i = 0;
      for (;;) {

        if ((++i % 100000) == 0) {
          System.out.println(" i : " + i);
          Thread.sleep(1000);
        }
        map.put(new Mem2("key"), "value");

      }

    } catch (Exception e) {
      System.out.println("Erreur");
      e.printStackTrace();
    }
  }
}
