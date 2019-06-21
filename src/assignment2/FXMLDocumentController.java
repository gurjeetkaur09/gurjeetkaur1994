/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;




import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author gurjeet kaur
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField numUSB;
@FXML private TextField numKeyboard;
@FXML private TextField numMouse;
@FXML private TextField discountField;




@FXML private CheckBox usbCB;
@FXML private CheckBox keyboardCB;
@FXML private CheckBox mouseCB;
@FXML private Button totalButton;




@FXML private Button resetButton;
@FXML private Button exitButton;
@FXML private TextArea resultArea;
private final double USB = 20;
private final double KEYBOARD = 12;
private final double MOUSE = 10;
  
  
@Override
public void initialize(URL url, ResourceBundle rb) {
numUSB.setText("");
numUSB.setDisable(true);
numKeyboard.setDisable(true);



numKeyboard.setText("");
numMouse.setDisable(true);
numMouse.setText("");
}
  
@FXML
private void USBCBAction()
{
if(usbCB.isSelected())
numUSB.setDisable(false);




else
{
numUSB.setText("");
numUSB.setDisable(true);
}
}
  
@FXML
private void KeyboardCBAction()
{
if(keyboardCB.isSelected())
numKeyboard.setDisable(false);
else
{
numKeyboard.setText("");
numKeyboard.setDisable(true);
}
}
  
@FXML
private void MouseCBAction()
{
if(mouseCB.isSelected())
numMouse.setDisable(false);
else
{
numMouse.setText("");
numMouse.setDisable(true);
}
}
  
@FXML
private void TotalButtonAction()
{
int numOfUSB = 0, numOfKeyboard = 0, numOfMouse = 0;
String usbString = "", keyboardString = "", mouseString = "", discountString = "", totalString = "";
double usbTot = 0, keyTot = 0, mouseTot = 0, discount = 0, allTotal = 0;
if(usbCB.isSelected())
{
if(numUSB.getText().equals(""))
JOptionPane.showMessageDialog(null, "pls enter the number of USB's");
else
{
numOfUSB = Integer.parseInt(numUSB.getText().trim());
usbString = "USB = $" + (numOfUSB * USB);
usbTot = (numOfUSB * USB);
}
}
else
{
numOfUSB = 0;
usbString = "";
usbTot = 0;
}
  
if(keyboardCB.isSelected())
{
if(numKeyboard.getText().equals(""))
JOptionPane.showMessageDialog(null, "pls enter the number of Keyboards at here ");
else
{
numOfKeyboard = Integer.parseInt(numKeyboard.getText().trim());
keyboardString = "Keyboard = $" + (numOfKeyboard * KEYBOARD);




keyTot = (numOfKeyboard * KEYBOARD);
}
}
else
{
numOfKeyboard = 0;
keyboardString = "";
keyTot = 0;
}
  
if(mouseCB.isSelected())
{
if(numMouse.getText().equals(""))
JOptionPane.showMessageDialog(null, "pls enter the number of Mouse");




else
{
numOfMouse = Integer.parseInt(numMouse.getText().trim());
mouseString = "Mouse = $" + (numOfMouse * MOUSE);
mouseTot = (numOfMouse * MOUSE);
}
}
else
{
numOfMouse = 0;
mouseString = "";



mouseTot = 0;
}
  
if(discountField.getText().equals(""))
{
discount = 0;
discountString = "";
}
else
{
discount = Double.parseDouble(discountField.getText().trim());



discountString = "Discount = $" + discount;
}
  
allTotal = (usbTot + keyTot + mouseTot) - discount;
totalString = usbString + "\n"
+ keyboardString + "\n"
+ mouseString + "\n"
+ discountString + "\n------------------------------\n"
+ "Total = $" + allTotal;
totalString = totalString.replaceAll("(?m)^\\s*$[\n\r]{1,}", ""); // lines are removed which are extra
  
resultArea.setText(totalString);
}
  
@FXML
private void ResetButtonAction()
{
usbCB.setSelected(false);
numUSB.setText("");
numUSB.setDisable(true);



keyboardCB.setSelected(false);
numKeyboard.setText("");
numKeyboard.setDisable(true);



mouseCB.setSelected(false);
numMouse.setText("");
numMouse.setDisable(true);
discountField.setText("");
resultArea.setText("");
}
  
@FXML
private void ExitButtonAction()
{
System.exit(0);
}
}