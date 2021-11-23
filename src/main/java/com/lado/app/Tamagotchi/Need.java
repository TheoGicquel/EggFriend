package com.lado.app.Tamagotchi;

public class Need {

  String name;
  int value;
  double factor;
  boolean critical;

  Need(String name, int value, double factor) {
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

  int setVal(int value) {
    this.value = value;
    return value;
  }

  void setName(String name) {
    this.name = name;
  }

  void setFactor(double factor) {
    this.factor = factor;
  }

  public int getVal() {
    return this.value;
  }
}
