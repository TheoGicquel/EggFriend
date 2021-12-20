package com.lado.app.Model.Tamagotchi;


public class Need {

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
    this.factor = 1;
    this.critical = false;
  }

  void setCritical(boolean critical) {
    this.critical = critical;
  }

  boolean isCritical() {
    return this.critical;
  }

  /***
   * @brief change la valeur du besoin selon le temps écoulé (minutes) et
   *  le facteur d'évolution du besoin
   * @param time
   */
  void calcDepletion(Float time) {
    int newValue = (int) (this.value - (time * this.factor));
    this.setVal(newValue);
  }

  int setVal(int value) {
    if (value < 0) {
      this.value = 0;
    } else if (value > 100) {
      this.value = 100;
    } else {
      this.value = value;
    }

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
