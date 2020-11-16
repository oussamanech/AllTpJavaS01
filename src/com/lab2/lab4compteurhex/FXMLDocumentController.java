/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab2.lab4compteurhex;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author pc
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField idHex;
    @FXML
    private TextField idDecimal;
    
    public int count =0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idHex.setText(""+count);
        idDecimal.setText(""+count);
    }    
  

    public void incrémente(int inc){
            this.count += inc;
}
    public void decremente(int dec){
            count -= dec;
}
    public int getValeur(){
            return count;
}
    public void setValuer(int c) {
            this.count = c;
}


    @FXML
    private void incremente(ActionEvent event) {
        int idDec = Integer.valueOf(idDecimal.getText())+1;
        
        idDecimal.setText(""+idDec);
        idHex.setText(Integer.toHexString(idDec));
    }
    
    
    @FXML
    private void decremente(ActionEvent event) {
          int idDec = Integer.valueOf(idDecimal.getText())-1;
          
             idDecimal.setText(""+idDec);
        idHex.setText(Integer.toHexString(idDec));
    }

    @FXML
    private void HexToDicemal(ActionEvent event) {
        
      String x= idHex.getText();
      idDecimal.setText( ""+ Integer.parseInt(x,16) );
        
    }

    @FXML
    private void DecimalToHex(ActionEvent event) {
     int x=  Integer.valueOf( idDecimal.getText());
     idHex.setText( Integer.toHexString(x));
    }

    @FXML
    private void clear(ActionEvent event) {
        idHex.setText(""+0);
        idDecimal.setText(""+0);
    }


    
}
