package com.lado.app.Model.Tamagotchi;

import java.io.Serializable;

public class Need implements Serializable{

  private String name;
  private int value;
  private float factor;
  private boolean critical;
 private String descriptor;

  Need(String name,String descriptor, int value, Float factor) {
    this.value = value;
    this.name = name;
    this.descriptor = descriptor;
    this.factor = factor;
    this.critical = false;
  }

  Need() {
    this.value = 100;
    this.name = "unknown";
    this.descriptor = "descriptor";
    this.factor = 0.01f;
    this.critical = false;
  }

  void setCritical(boolean critical) {
    this.critical = critical;
  }

  boolean isCritical() {
    return this.critical;
  }

  /***
   * @brief change la valeur du besoin selon le temps écoulé (secondes) et
   *  le facteur d'évolution du besoin
   * @param timeElapsed
   */
  void calcDepletion(long timeElapsed) {
    System.out.println("calcDepletion");
   // System.out.println("elapsed : [" + timeElapsed + "ms ]");
   // System.out.println("factor : [" + this.factor + "]");
   // System.out.println("value : [" + this.value + "]");
    int newValue = (int) (this.value - (timeElapsed * (this.factor/100)));
    this.setVal(newValue);
  }

  int setVal(int value) {
//    System.out.println("[setval :" + value + "]");

    this.value = value;

    if (this.value < 0) {
      this.value = 0;
    } else if (this.value > 100) {
      this.value = 100;
    } else {
      
    }
    System.out.println(this.value);
    return this.value;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setFactor(Float factor) {
    this.factor = factor;
  }

  public int getVal() {
    return this.value;
  }

public String getDescriptor() {
    return this.descriptor;
}



}
