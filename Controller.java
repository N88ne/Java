package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField InputA,InputB,Output;
    private String Number;
    private double num1 = 0;
    private double num2 = 0;
    private String operation = "";
    private boolean start = true;
    private Model model =new Model();


    @FXML
    private void PrNum(ActionEvent actionEvent)
    {

    }

    @FXML
    private void PrOperation(ActionEvent actionEvent)
    {
        operation = ((Button)actionEvent.getSource()).getText();
        if((model.CheckString(InputA.getText()) && model.CheckString(InputB.getText()))&& !(operation.equals("/") && InputB.getText().equals("0")) )
        {
        num1=  Double.parseDouble(InputA.getText());
        num2= Double.parseDouble(InputB.getText());
        operation = ((Button)actionEvent.getSource()).getText();
        model.FourSh(model.calculation(num1,num2,operation));
        Output.setText(String.valueOf(model.FourSh(model.calculation(num1,num2,operation))));
        }
        else
        {
            Output.setText("Введите заново");
        }

    }
}
