package com.example.celsius;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button clear,conv,exit;

    @FXML
    private ComboBox<String> comb;

    @FXML
    private TextField txtC,txtF;

    @FXML
    private Label errr;

    @FXML
    void clearb(ActionEvent event) {
        txtC.setText("");
        txtF.setText("");
    }

    @FXML
    void convb(ActionEvent event) {
        trying();
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void select(ActionEvent event) {

    }

    public void trying(){
        if(txtF.getText().equals("")){
            try{
                CF();
            }catch (NumberFormatException ex) {
                errr.setVisible(true);
            }
        }else if(txtC.getText().equals("")){
            try{
                FC();
            }catch (NumberFormatException ex) {
                errr.setVisible(true);
            }
        }else errr.setVisible(true);
    }
    public void CF(){
        double farenheit = (Double.parseDouble(txtC.getText())*9.0/5.0)+32.0;
        txtF.setText(Double.toString(farenheit));
    }
    public void FC(){
        double celsium = (Double.parseDouble(txtF.getText())-32.0)*5.0/9.0;
        txtC.setText(Double.toString(celsium));
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        comb.getItems().removeAll(comb.getItems());
//        comb.getItems().addAll("Option A", "Option B", "Option C");
//        comb.getSelectionModel().select("Option B");
//    }
}
