package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {
    private final Bmi bmi = new Bmi();
    @FXML
    public TextField weight;
    @FXML
    public TextField height;
    @FXML
    public TextField index;
    @FXML
    public Button Calculate;
    

    

    @FXML
    protected void onCalculateButtonClick() {
        bmi.setM(Double.parseDouble(weight.getText()));
        bmi.setH(Double.parseDouble(height.getText()));
        double bmiValue = this.bmi.calc();
        if (bmiValue >= 0 && bmiValue <= 16 || bmiValue >= 30) {
            this.index.setStyle("-fx-text-fill: red;");
        } else if (bmiValue >= 16 && bmiValue <= 18.5 || bmiValue >= 25 && bmiValue < 30) {
            this.index.setStyle("-fx-text-fill: yellow;");
        } else {
            this.index.setStyle("-fx-text-fill: green;");
        }
        this.index.setText(String.valueOf(bmiValue));



    }
}