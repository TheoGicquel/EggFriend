package com.lado.app.View.UIPackage;

import java.awt.*;
import javax.lang.model.element.TypeElement;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * verticalBuilder
 */
public class UIBuilder extends JFrame {

  void itemBuilder(TypeElement itemType) {}

  static JLabel verticalBuilder(
    String content,
    int defaultx,
    int defaulty,
    int increment,
    int rowNumber,
    Font textFont
  ) {
    int width = 500;
    int height = 40;
    int xPosition = defaultx;
    int yPosition = defaulty + (increment * rowNumber);

    JLabel newLabel = new JLabel();

    newLabel.setBounds(xPosition, yPosition, width, height);
    newLabel.setText(content);
    newLabel.setFont(textFont);
    return newLabel;
  }

  JLabel horizontalBuilder(
    String content,
    int defaultx,
    int defaulty,
    int increment,
    int rowNumber,
    Font textFont
  ) {
    int width = 500;
    int height = 40;
    int xPosition = defaultx;
    int yPosition = defaulty + (increment * rowNumber);

    JLabel newLabel = new JLabel();

    newLabel.setBounds(xPosition, yPosition, width, height);
    newLabel.setText(content);
    newLabel.setFont(textFont);
    return newLabel;
  }
}
