package fr.javagc.test1;

import java.util.Random;

public class Mem1 {

  private String unit = "";

  private StringBuilder builder = new StringBuilder();

  public Mem1() {
    super();
    System.out.println("Init de unit : " + unit.length());
    StringBuilder c = new StringBuilder();
    for (int i = 0; i < 1000 * 1000 * 1; i++) {
      c.append((new Random()).nextInt(9));
    }
    unit = c.toString();
    System.out.println("taille de unit : " + unit.length());
  }

  public void append(int nb) {

    System.out.println("append start");
    for (int i = 0; i < nb; i++) {
      StringBuilder tmp = new StringBuilder(builder);
      tmp.append(unit);
    }
    System.out.println("append end");
    try {
      System.out.println("Pause de 10s");

      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}
