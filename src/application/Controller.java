package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	int A;
	int B;
	String op;
	@FXML
	private TextField answer;

	@FXML
	private Button btn7;

	@FXML
	private Button btn8;

	@FXML
	private Button btn9;

	@FXML
	private Button btnDiv;

	@FXML
	private Button btn4;

	@FXML
	private Button btn5;

	@FXML
	private Button btn6;

	@FXML
	private Button btnMul;

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@FXML
	private Button btnMinius;

	@FXML
	private Button btn0;

	@FXML
	private Button btnDot;

	@FXML
	private Button btnEqual;

	@FXML
	private Button btnPlus;

	@FXML
	private Button btnclear;

	@FXML
	void btnPressed(ActionEvent event) {
		Button btn = (Button) event.getSource();
		// answer.setText(btn.getText());
		if (btn.getText().equals("Clear")) {
			answer.setText("");
		} 
		else if(btn.getText().equals("+")){
			op = "+";
			A = Integer.parseInt(answer.getText());
			answer.setText("");
		}
		else if(btn.getText().equals("-")){
			op = "-";
			A = Integer.parseInt(answer.getText());
			answer.setText("");
		}
		else if(btn.getText().equals("*")){
			op = "*";
			A = Integer.parseInt(answer.getText());
			answer.setText("");
		}
		else if(btn.getText().equals("/")){
			op = "/";
			A = Integer.parseInt(answer.getText());
			answer.setText("");
		}
		else if(btn.getText().equals("=")){
			B = Integer.parseInt(answer.getText());
			if(op.equals("+")) {
				answer.setText(A+B+"");
			}else if(op.equals("-")) {
				answer.setText(A-B+"");
			}else if(op.equals("*")) {
				answer.setText(A*B+"");
			}else{
				answer.setText(A/B+"");
			}
			
		}
		else {
			String OldText = answer.getText();
			String newText = OldText + btn.getText();
			answer.setText(newText);
		}
	}
}
