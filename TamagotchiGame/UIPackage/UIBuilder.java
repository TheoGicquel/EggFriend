package UIPackage;

import java.lang.ProcessBuilder.Redirect.Type;

import javax.lang.model.element.TypeElement;
import javax.swing.JFrame;

/**
 * verticalBuilder
 */
public class UIBuilder extends JFrame{


    void itemBuilder(TypeElement itemType)

    JLabel verticalBuilder(String content, int defaultx, int defaulty, int increment, int rowNumber, Font textFont)
    {
        int width=500;
        int height=40;
        int xPosition=defaultx;
        int yPosition=defaulty+(increment*rowNumber);

        JLabel newLabel = new JLabel();

        newLabel.setBounds(xPosition, yPosition, width, height);
        newLabel.setText(content);
        newLabel.setFont(textFont);
        return newLabel;
    }


    JLabel horizontalBuilder(String content, int defaultx, int defaulty, int increment, int rowNumber, Font textFont)
    {
        int width=500;
        int height=40;
        int xPosition=defaultx;
        int yPosition=defaulty+(increment*rowNumber);

        JLabel newLabel = new JLabel();

        newLabel.setBounds(xPosition, yPosition, width, height);
        newLabel.setText(content);
        newLabel.setFont(textFont);
        return newLabel;
    }
    
}