package com.lado.app.model.tamagotchi;
/**
 * @file Need.java
 * @author Théo Gicquel
 * Objet représentant un besoin du Tamagotchi (faim, hygiène, énergie, santé,etc..)
 */
import java.io.Serializable;

public class Need implements Serializable{
  private static final int CRITICAL_THRESHOLD = 10;

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



  /**
   * Détermine si le besoin est inférieur à la valeur critique
   * @return true si inférieur, false sinon
   */
  boolean isBelowCritical()
  {
    return(this.getVal() <= CRITICAL_THRESHOLD);
  }

  /***
   * @brief change la valeur du besoin selon le temps écoulé (secondes) et
   *  le facteur d'évolution du besoin
   * @param timeElapsed temps en milisecondes écoulée depuis la dernière modification
   */
  void calcDepletion(int secondsElapsed) {
    int output = this.getVal() - (int)(secondsElapsed * this.factor);
    //System.out.println("New Value of need " + this.name + " is " + output);
    this.setVal(output);
  }

  int setVal(int value) {

    this.value = value;

    if (this.value < 0) {
      this.value = 0;
    } else if (this.value > 100) {
      this.value = 100;
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


  Float getFactor() {
    return this.factor;
  }
public String getDescriptor() {
    return this.descriptor;
}



}
