/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author User
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class ConfigPanel extends JPanel{
    private final MainFrame frame;
    private JLabel sidesLabel; // we’re drawing regular polygons
    private JLabel labelColor;
    private JSpinner sidesField; // number of sides
    private JComboBox<String> colorCombo; // the color of the shape
    
    public MainFrame getFrame(){
        return frame;
    }
    
    public JLabel getLabel(){
        return sidesLabel;
    }
    
    public JSpinner getSpinner(){
       return sidesField;
    }
    
    public JLabel getColo(){
        return labelColor;
    }
    
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    
    public int getValue(){
        Random rand=new Random();
        return rand.nextInt(1000);
    }
    
    private void init() {
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6); //default number of sides
        //create the colorCombo, containing the values: Random and Black
        labelColor=new JLabel("Color: ");
        String[] colors={"random","black"};
        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(colorCombo);
    }

}
