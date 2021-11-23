package com.lado.app.Tamagotchi;

public class Need {

  String name;
  int value;
  float factor;
  boolean critical;

  Need(String name, int value, Float factor) {
    this.value = value;
    this.name = name;
    this.factor = factor;
    this.critical = false;
  }

  Need() {
    this.value = 100;
    this.name = "unknown";
    this.factor = 1;
    this.critical = false;
  }

  void setCritical(boolean critical) {
    this.critical = critical;
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

  void setName(String name) {
    this.name = name;
  }

  void setFactor(Float factor) {
    this.factor = factor;
  }

  public int getVal() {
    return this.value;
  }
}
