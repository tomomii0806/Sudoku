import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class PlayController implements Initializable{

	@FXML
	private Button button;
	@FXML 
	private Label label;
	@FXML
	private TextField one_one;
	@FXML
	private TextField one_two;
	@FXML
	private TextField one_three;
	@FXML
	private TextField one_four;
	@FXML
	private TextField one_five;
	@FXML
	private TextField one_six;
	@FXML
	private TextField one_seven;
	@FXML
	private TextField one_eight;
	@FXML
	private TextField one_nine;
	@FXML
	private TextField two_one;
	@FXML
	private TextField two_two;
	@FXML
	private TextField two_three;
	@FXML
	private TextField two_four;
	@FXML
	private TextField two_five;
	@FXML
	private TextField two_six;
	@FXML
	private TextField two_seven;
	@FXML
	private TextField two_eight;
	@FXML
	private TextField two_nine;
	@FXML
	private TextField three_one;
	@FXML
	private TextField three_two;
	@FXML
	private TextField three_three;
	@FXML
	private TextField three_four;
	@FXML
	private TextField three_five;
	@FXML
	private TextField three_six;
	@FXML
	private TextField three_seven;
	@FXML
	private TextField three_eight;
	@FXML
	private TextField three_nine;
	@FXML
	private TextField four_one;
	@FXML
	private TextField four_two;
	@FXML
	private TextField four_three;
	@FXML
	private TextField four_four;
	@FXML
	private TextField four_five;
	@FXML
	private TextField four_six;
	@FXML
	private TextField four_seven;
	@FXML
	private TextField four_eight;
	@FXML
	private TextField four_nine;
	@FXML
	private TextField five_one;
	@FXML
	private TextField five_two;
	@FXML
	private TextField five_three;
	@FXML
	private TextField five_four;
	@FXML
	private TextField five_five;
	@FXML
	private TextField five_six;
	@FXML
	private TextField five_seven;
	@FXML
	private TextField five_eight;
	@FXML
	private TextField five_nine;
	@FXML
	private TextField six_one;
	@FXML
	private TextField six_two;
	@FXML
	private TextField six_three;
	@FXML
	private TextField six_four;
	@FXML
	private TextField six_five;
	@FXML
	private TextField six_six;
	@FXML
	private TextField six_seven;
	@FXML
	private TextField six_eight;
	@FXML
	private TextField six_nine;
	@FXML
	private TextField seven_one;
	@FXML
	private TextField seven_two;
	@FXML
	private TextField seven_three;
	@FXML
	private TextField seven_four;
	@FXML
	private TextField seven_five;
	@FXML
	private TextField seven_six;
	@FXML
	private TextField seven_seven;
	@FXML
	private TextField seven_eight;
	@FXML
	private TextField seven_nine;
	@FXML
	private TextField eight_one;
	@FXML
	private TextField eight_two;
	@FXML
	private TextField eight_three;
	@FXML
	private TextField eight_four;
	@FXML
	private TextField eight_five;
	@FXML
	private TextField eight_six;
	@FXML
	private TextField eight_seven;
	@FXML
	private TextField eight_eight;
	@FXML
	private TextField eight_nine;
	@FXML
	private TextField nine_one;
	@FXML
	private TextField nine_two;
	@FXML
	private TextField nine_three;
	@FXML
	private TextField nine_four;
	@FXML
	private TextField nine_five;
	@FXML
	private TextField nine_six;
	@FXML
	private TextField nine_seven;
	@FXML
	private TextField nine_eight;
	@FXML
	private TextField nine_nine;
	
	/*private TextField sudoku[][] =  {
								{one_one, one_two, one_three, one_four, one_five, one_six, one_seven, one_eight, one_nine},
								{two_one, two_two, two_three, two_four, two_five, two_six, two_seven, two_eight, two_nine},
								{three_one, three_two, three_three, three_four, three_five, three_six, three_seven, three_eight, three_nine},
								{four_one, four_two, four_three, four_four, four_five, four_six, four_seven, four_eight, four_nine},
								{five_one, five_two, five_three, five_four, five_five, five_six, five_seven, five_eight, five_nine},
								{six_one, six_two, six_three, six_four, six_five, six_six, six_seven, six_eight, six_nine},
								{seven_one, seven_two, seven_three, seven_four, seven_five, seven_six, seven_seven, seven_eight, seven_nine},
								{eight_one, eight_two, eight_three, eight_four, eight_five, eight_six, eight_seven, eight_eight, eight_nine},
								{nine_one, nine_two, nine_three, nine_four, nine_five, nine_six, nine_seven, nine_eight, nine_nine}};
	*/
	
	private boolean[][] sudoku;	//true is the answer of the cell is already in, false is the cell is empty
	private int incorrect;
	private int K;
	
	
	
	/**
	 * 
	 */
	

	Sudoku sdk = new Sudoku(20);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		sudoku = new boolean[9][9];
		for (int i = 0; i < sudoku.length; i++)
		{
			for (int j = 0; j < sudoku.length; j++)
			{
				sudoku[i][j] = false;
			}
		}
		
		//String str = one_one;
		if (sdk.getSudoku()[0][0] != 0)
		{
			one_one.setText(String.valueOf(sdk.getSudoku()[0][0]));
			one_one.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][0] = true;
		}
		if (sdk.getSudoku()[0][1] != 0)
		{
			one_two.setText(String.valueOf(sdk.getSudoku()[0][1]));
			one_two.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][1] = true;
		}
		if (sdk.getSudoku()[0][2] != 0)
		{
			one_three.setText(String.valueOf(sdk.getSudoku()[0][2]));
			one_three.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][2] = true;
		}
		if (sdk.getSudoku()[0][3] != 0)
		{
			one_four.setText(String.valueOf(sdk.getSudoku()[0][3]));
			one_four.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][3] = true;
		}
		if (sdk.getSudoku()[0][4] != 0)
		{
			one_five.setText(String.valueOf(sdk.getSudoku()[0][4]));
			one_five.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][4] = true;
		}
		if (sdk.getSudoku()[0][5] != 0)
		{
			one_six.setText(String.valueOf(sdk.getSudoku()[0][5]));
			one_six.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][5] = true;
		}
		if (sdk.getSudoku()[0][6] != 0)
		{
			one_seven.setText(String.valueOf(sdk.getSudoku()[0][6]));
			one_seven.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][6] = true;
		}
		if (sdk.getSudoku()[0][7] != 0)
		{
			one_eight.setText(String.valueOf(sdk.getSudoku()[0][7]));
			one_eight.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][7] = true;
		}
		if (sdk.getSudoku()[0][8] != 0)
		{
			one_nine.setText(String.valueOf(sdk.getSudoku()[0][8]));
			one_nine.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[0][8] = true;
		}
		if (sdk.getSudoku()[1][0] != 0)
		{
			two_one.setText(String.valueOf(sdk.getSudoku()[1][0]));
			two_one.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[1][0] = true;
		}
		if (sdk.getSudoku()[1][1] != 0)	{
			two_two.setText(String.valueOf(sdk.getSudoku()[1][1]));
			two_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][2] != 0)	{
			two_three.setText(String.valueOf(sdk.getSudoku()[1][2]));
			two_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][3] != 0)	{
			two_four.setText(String.valueOf(sdk.getSudoku()[1][3]));
			two_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][4] != 0)	{
			two_five.setText(String.valueOf(sdk.getSudoku()[1][4]));
			two_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][5] != 0)	{
			two_six.setText(String.valueOf(sdk.getSudoku()[1][5]));
			two_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][6] != 0)	{
			two_seven.setText(String.valueOf(sdk.getSudoku()[1][6]));
			two_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][7] != 0)	{
			two_eight.setText(String.valueOf(sdk.getSudoku()[1][7]));
			two_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[1][8] != 0)	{
			two_nine.setText(String.valueOf(sdk.getSudoku()[1][8]));
			two_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][0] != 0)	{
			three_one.setText(String.valueOf(sdk.getSudoku()[2][0]));
			three_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][1] != 0)	{
			three_two.setText(String.valueOf(sdk.getSudoku()[2][1]));
			three_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][2] != 0)	{
			three_three.setText(String.valueOf(sdk.getSudoku()[2][2]));
			three_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][3] != 0)	{
			three_four.setText(String.valueOf(sdk.getSudoku()[2][3]));
			three_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][4] != 0)	{
			three_five.setText(String.valueOf(sdk.getSudoku()[2][4]));
			three_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][5] != 0)	{
			three_six.setText(String.valueOf(sdk.getSudoku()[2][5]));
			three_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][6] != 0)	{
			three_seven.setText(String.valueOf(sdk.getSudoku()[2][6]));
			three_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][7] != 0)	{
			three_eight.setText(String.valueOf(sdk.getSudoku()[2][7]));
			three_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[2][8] != 0)	{
			three_nine.setText(String.valueOf(sdk.getSudoku()[2][8]));
			three_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][0] != 0)	{
			four_one.setText(String.valueOf(sdk.getSudoku()[3][0]));
			four_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][1] != 0)	{
			four_two.setText(String.valueOf(sdk.getSudoku()[3][1]));
			four_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][2] != 0)	{
			four_three.setText(String.valueOf(sdk.getSudoku()[3][2]));
			four_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][3] != 0)	{
			four_four.setText(String.valueOf(sdk.getSudoku()[3][3]));
			four_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][4] != 0)	{
			four_five.setText(String.valueOf(sdk.getSudoku()[3][4]));
			four_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][5] != 0)	{
			four_six.setText(String.valueOf(sdk.getSudoku()[3][5]));
			four_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][6] != 0)	{
			four_seven.setText(String.valueOf(sdk.getSudoku()[3][6]));
			four_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][7] != 0)	{
			four_eight.setText(String.valueOf(sdk.getSudoku()[3][7]));
			four_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[3][8] != 0)	{
			four_nine.setText(String.valueOf(sdk.getSudoku()[3][8]));
			four_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][0] != 0)	{
			five_one.setText(String.valueOf(sdk.getSudoku()[4][0]));
			five_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][1] != 0)	{
			five_two.setText(String.valueOf(sdk.getSudoku()[4][1]));
			five_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][2] != 0)	{
			five_three.setText(String.valueOf(sdk.getSudoku()[4][2]));
			five_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][3] != 0)	{
			five_four.setText(String.valueOf(sdk.getSudoku()[4][3]));
			five_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][4] != 0)	{
			five_five.setText(String.valueOf(sdk.getSudoku()[4][4]));
			five_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][5] != 0)	{
			five_six.setText(String.valueOf(sdk.getSudoku()[4][5]));
			five_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][6] != 0)	{
			five_seven.setText(String.valueOf(sdk.getSudoku()[4][6]));
			five_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][7] != 0)	{
			five_eight.setText(String.valueOf(sdk.getSudoku()[4][7]));
			five_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[4][8] != 0)	{
			five_nine.setText(String.valueOf(sdk.getSudoku()[4][8]));
			five_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][0] != 0)	{
			six_one.setText(String.valueOf(sdk.getSudoku()[5][0]));
			six_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][1] != 0)	{
			six_two.setText(String.valueOf(sdk.getSudoku()[5][1]));
			six_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][2] != 0)	{
			six_three.setText(String.valueOf(sdk.getSudoku()[5][2]));
			six_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][3] != 0)	{
			six_four.setText(String.valueOf(sdk.getSudoku()[5][3]));
			six_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][4] != 0)	{
			six_five.setText(String.valueOf(sdk.getSudoku()[5][4]));
			six_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][5] != 0)	{
			six_six.setText(String.valueOf(sdk.getSudoku()[5][5]));
			six_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][6] != 0)	{
			six_seven.setText(String.valueOf(sdk.getSudoku()[5][6]));
			six_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][7] != 0)	{
			six_eight.setText(String.valueOf(sdk.getSudoku()[5][7]));
			six_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[5][8] != 0)	{
			six_nine.setText(String.valueOf(sdk.getSudoku()[5][8]));
			six_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][0] != 0)	{
			seven_one.setText(String.valueOf(sdk.getSudoku()[6][0]));
			seven_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][1] != 0)	{
			seven_two.setText(String.valueOf(sdk.getSudoku()[6][1]));
			seven_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][2] != 0)	{
			seven_three.setText(String.valueOf(sdk.getSudoku()[6][2]));
			seven_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][3] != 0)	{
			seven_four.setText(String.valueOf(sdk.getSudoku()[6][3]));
			seven_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][4] != 0)	{
			seven_five.setText(String.valueOf(sdk.getSudoku()[6][4]));
			seven_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][5] != 0)	{
			seven_six.setText(String.valueOf(sdk.getSudoku()[6][5]));
			seven_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][6] != 0)	{
			seven_seven.setText(String.valueOf(sdk.getSudoku()[6][6]));
			seven_seven.setStyle("-fx-control-inner-background: #bc0202");
			sudoku[6][6] = true;
		}
		if (sdk.getSudoku()[6][7] != 0)	{
			seven_eight.setText(String.valueOf(sdk.getSudoku()[6][7]));
			seven_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[6][8] != 0)	{
			seven_nine.setText(String.valueOf(sdk.getSudoku()[6][8]));
			seven_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][0] != 0)	{
			eight_one.setText(String.valueOf(sdk.getSudoku()[7][0]));
			eight_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][1] != 0)	{
			eight_two.setText(String.valueOf(sdk.getSudoku()[7][1]));
			eight_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][2] != 0)	{
			eight_three.setText(String.valueOf(sdk.getSudoku()[7][2]));
			eight_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][3] != 0)	{
			eight_four.setText(String.valueOf(sdk.getSudoku()[7][3]));
			eight_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][4] != 0)	{
			eight_five.setText(String.valueOf(sdk.getSudoku()[7][4]));
			eight_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][5] != 0)	{
			eight_six.setText(String.valueOf(sdk.getSudoku()[7][5]));
			eight_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][6] != 0)	{
			eight_seven.setText(String.valueOf(sdk.getSudoku()[7][6]));
			eight_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][7] != 0)	{
			eight_eight.setText(String.valueOf(sdk.getSudoku()[7][7]));
			eight_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[7][8] != 0)	{
			eight_nine.setText(String.valueOf(sdk.getSudoku()[7][8]));
			eight_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][0] != 0)	{
			nine_one.setText(String.valueOf(sdk.getSudoku()[8][0]));
			nine_one.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][1] != 0)	{
			nine_two.setText(String.valueOf(sdk.getSudoku()[8][1]));
			nine_two.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][2] != 0)	{
			nine_three.setText(String.valueOf(sdk.getSudoku()[8][2]));
			nine_three.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][3] != 0)	{
			nine_four.setText(String.valueOf(sdk.getSudoku()[8][3]));
			nine_four.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][4] != 0)	{
			nine_five.setText(String.valueOf(sdk.getSudoku()[8][4]));
			nine_five.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][5] != 0)	{
			nine_six.setText(String.valueOf(sdk.getSudoku()[8][5]));
			nine_six.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][6] != 0)	{
			nine_seven.setText(String.valueOf(sdk.getSudoku()[8][6]));
			nine_seven.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][7] != 0)	{
			nine_eight.setText(String.valueOf(sdk.getSudoku()[8][7]));
			nine_eight.setStyle("-fx-control-inner-background: #bc0202");
		}
		if (sdk.getSudoku()[8][8] != 0)	{
			nine_nine.setText(String.valueOf(sdk.getSudoku()[8][8]));
			nine_nine.setStyle("-fx-control-inner-background: #bc0202");
		}
		
	}
	
	public void getAnswers(ActionEvent event) {
		
		incorrect = 0;
		
		/*one_one.setFill() 
		one_two.setFill() 
		one_three.setFill() 
		one_four.setFill() 
		one_five.setFill() 
		one_six.setFill() 
		one_seven.setFill() 
		one_eight.setFill() 
		one_nine.setFill()
		two_one.setFill() 
		two_two.setFill() 
		two_three.setFill() 
		two_four.setFill() 
		two_five, 
		two_six, 
		two_seven, 
		two_eight, 
		two_nine,
		three_one, 
		three_two, 
		three_three, 
		three_four, 
		three_five, 
		three_six, 
		three_seven, 
		three_eight, 
		three_nine,
		four_one, 
		four_two, 
		four_three, 
		four_four, 
		four_five, 
		four_six, 
		four_seven, 
		four_eight, 
		four_nine,
		five_one, five_two, five_three, five_four, five_five, five_six, five_seven, five_eight, five_nine},
		six_one, six_two, six_three, six_four, six_five, six_six, six_seven, six_eight, six_nine},
	{seven_one, seven_two, seven_three, seven_four, seven_five, seven_six, seven_seven, seven_eight, seven_nine},
	{eight_one, eight_two, eight_three, eight_four, eight_five, eight_six, eight_seven, eight_eight, eight_nine},
	{nine_one, nine_two, nine_three, nine_four, nine_five, nine_six, nine_seven, nine_eight, nine_nine
		*/
		
		if (!one_one.getText().equals(String.valueOf(sdk.getAnswers()[0][0]))){
			one_one.setStyle("-fx-control-inner-background: #530c0c");
			one_one.setText(String.valueOf(sdk.getAnswers()[0][0]));
			incorrect++;
		}
		if (!one_two.getText().equals(String.valueOf(sdk.getAnswers()[0][1]))){
			one_two.setStyle("-fx-control-inner-background: #530c0c");
			one_two.setText(String.valueOf(sdk.getAnswers()[0][1]));
			incorrect++;
		}
		if (!one_three.getText().equals(String.valueOf(sdk.getAnswers()[0][2]))){
			one_three.setStyle("-fx-control-inner-background: #530c0c");
			one_three.setText(String.valueOf(sdk.getAnswers()[0][2]));
			incorrect++;
		}
		if (!one_four.getText().equals(String.valueOf(sdk.getAnswers()[0][3]))){
			one_four.setStyle("-fx-control-inner-background: #530c0c");
			one_four.setText(String.valueOf(sdk.getAnswers()[0][3]));
			incorrect++;
		}
		if (!one_five.getText().equals(String.valueOf(sdk.getAnswers()[0][4]))){
			one_five.setStyle("-fx-control-inner-background: #530c0c");
			one_five.setText(String.valueOf(sdk.getAnswers()[0][4]));
			incorrect++;
		}
		if (!one_six.getText().equals(String.valueOf(sdk.getAnswers()[0][5]))){
			one_six.setStyle("-fx-control-inner-background: #530c0c");
			one_six.setText(String.valueOf(sdk.getAnswers()[0][5]));
			incorrect++;
		}
		if (!one_seven.getText().equals(String.valueOf(sdk.getAnswers()[0][6]))){
			one_seven.setStyle("-fx-control-inner-background: #530c0c");
			one_seven.setText(String.valueOf(sdk.getAnswers()[0][6]));
			incorrect++;
		}
		if (!one_eight.getText().equals(String.valueOf(sdk.getAnswers()[0][7]))){
			one_eight.setStyle("-fx-control-inner-background: #530c0c");
			one_eight.setText(String.valueOf(sdk.getAnswers()[0][7]));
			incorrect++;
		}
		if (!one_nine.getText().equals(String.valueOf(sdk.getAnswers()[0][8]))){
			one_nine.setStyle("-fx-control-inner-background: #530c0c");
			one_nine.setText(String.valueOf(sdk.getAnswers()[0][8]));
			incorrect++;
		}
		if (!two_one.getText().equals(String.valueOf(sdk.getAnswers()[1][0]))){
			two_one.setStyle("-fx-control-inner-background: #530c0c");
			two_one.setText(String.valueOf(sdk.getAnswers()[1][0]));
			incorrect++;
		}
		if (!two_two.getText().equals(String.valueOf(sdk.getAnswers()[1][1]))){
			two_two.setStyle("-fx-control-inner-background: #530c0c");
			two_two.setText(String.valueOf(sdk.getAnswers()[1][1]));
			incorrect++;
		}
		if (!two_three.getText().equals(String.valueOf(sdk.getAnswers()[1][2]))){
			two_three.setStyle("-fx-control-inner-background: #530c0c");
			two_three.setText(String.valueOf(sdk.getAnswers()[1][2]));
			incorrect++;
		}
		if (!two_four.getText().equals(String.valueOf(sdk.getAnswers()[1][3]))){
			two_four.setStyle("-fx-control-inner-background: #530c0c");
			two_four.setText(String.valueOf(sdk.getAnswers()[1][3]));
			incorrect++;
		}
		if (!two_five.getText().equals(String.valueOf(sdk.getAnswers()[1][4]))){
			two_five.setStyle("-fx-control-inner-background: #530c0c");
			two_five.setText(String.valueOf(sdk.getAnswers()[1][4]));
			incorrect++;
		}
		if (!two_six.getText().equals(String.valueOf(sdk.getAnswers()[1][5]))){
			two_six.setStyle("-fx-control-inner-background: #530c0c");
			two_six.setText(String.valueOf(sdk.getAnswers()[1][5]));
			incorrect++;
		}
		if (!two_seven.getText().equals(String.valueOf(sdk.getAnswers()[1][6]))){
			two_seven.setStyle("-fx-control-inner-background: #530c0c");
			two_seven.setText(String.valueOf(sdk.getAnswers()[1][6]));
			incorrect++;
		}
		if (!two_eight.getText().equals(String.valueOf(sdk.getAnswers()[1][7]))){
			two_eight.setStyle("-fx-control-inner-background: #530c0c");
			two_eight.setText(String.valueOf(sdk.getAnswers()[1][7]));
			incorrect++;
		}
		if (!two_nine.getText().equals(String.valueOf(sdk.getAnswers()[1][8]))){
			two_nine.setStyle("-fx-control-inner-background: #530c0c");
			two_nine.setText(String.valueOf(sdk.getAnswers()[1][8]));
			incorrect++;
		}
		if (!three_one.getText().equals(String.valueOf(sdk.getAnswers()[2][0]))){
			three_one.setStyle("-fx-control-inner-background: #530c0c");
			three_one.setText(String.valueOf(sdk.getAnswers()[2][0]));
			incorrect++;
		}
		if (!three_two.getText().equals(String.valueOf(sdk.getAnswers()[2][1]))){
			three_two.setStyle("-fx-control-inner-background: #530c0c");
			three_two.setText(String.valueOf(sdk.getAnswers()[2][1]));
			incorrect++;
		}
		if (!three_three.getText().equals(String.valueOf(sdk.getAnswers()[2][2]))){
			three_three.setStyle("-fx-control-inner-background: #530c0c");
			three_three.setText(String.valueOf(sdk.getAnswers()[2][2]));
			incorrect++;
		}
		if (!three_four.getText().equals(String.valueOf(sdk.getAnswers()[2][3]))){
			three_four.setStyle("-fx-control-inner-background: #530c0c");
			three_four.setText(String.valueOf(sdk.getAnswers()[2][3]));
			incorrect++;
		}
		if (!three_five.getText().equals(String.valueOf(sdk.getAnswers()[2][4]))){
			three_five.setStyle("-fx-control-inner-background: #530c0c");
			three_five.setText(String.valueOf(sdk.getAnswers()[2][4]));
			incorrect++;
		}
		if (!three_six.getText().equals(String.valueOf(sdk.getAnswers()[2][5]))){
			three_six.setStyle("-fx-control-inner-background: #530c0c");
			three_six.setText(String.valueOf(sdk.getAnswers()[2][5]));
			incorrect++;
		}
		if (!three_seven.getText().equals(String.valueOf(sdk.getAnswers()[2][6]))){
			three_seven.setStyle("-fx-control-inner-background: #530c0c");
			three_seven.setText(String.valueOf(sdk.getAnswers()[2][6]));
			incorrect++;
		}
		if (!three_eight.getText().equals(String.valueOf(sdk.getAnswers()[2][7]))){
			three_eight.setStyle("-fx-control-inner-background: #530c0c");
			three_eight.setText(String.valueOf(sdk.getAnswers()[2][7]));
			incorrect++;
		}
		if (!three_nine.getText().equals(String.valueOf(sdk.getAnswers()[2][8]))){
			three_nine.setStyle("-fx-control-inner-background: #530c0c");
			three_nine.setText(String.valueOf(sdk.getAnswers()[2][8]));
			incorrect++;
		}
		if (!four_one.getText().equals(String.valueOf(sdk.getAnswers()[3][0]))){
			four_one.setStyle("-fx-control-inner-background: #530c0c");
			four_one.setText(String.valueOf(sdk.getAnswers()[3][0]));
			incorrect++;
		}
		if (!four_two.getText().equals(String.valueOf(sdk.getAnswers()[3][1]))){
			four_two.setStyle("-fx-control-inner-background: #530c0c");
			four_two.setText(String.valueOf(sdk.getAnswers()[3][1]));
			incorrect++;
		}
		if (!four_three.getText().equals(String.valueOf(sdk.getAnswers()[3][2]))){
			four_three.setStyle("-fx-control-inner-background: #530c0c");
			four_three.setText(String.valueOf(sdk.getAnswers()[3][2]));
			incorrect++;
		}
		if (!four_four.getText().equals(String.valueOf(sdk.getAnswers()[3][3]))){
			four_four.setStyle("-fx-control-inner-background: #530c0c");
			four_four.setText(String.valueOf(sdk.getAnswers()[3][3]));
			incorrect++;
		}
		if (!four_five.getText().equals(String.valueOf(sdk.getAnswers()[3][4]))){
			four_five.setStyle("-fx-control-inner-background: #530c0c");
			four_five.setText(String.valueOf(sdk.getAnswers()[3][4]));
			incorrect++;
		}
		if (!four_six.getText().equals(String.valueOf(sdk.getAnswers()[3][5]))){
			four_six.setStyle("-fx-control-inner-background: #530c0c");
			four_six.setText(String.valueOf(sdk.getAnswers()[3][5]));
			incorrect++;
		}
		if (!four_seven.getText().equals(String.valueOf(sdk.getAnswers()[3][6]))){
			four_seven.setStyle("-fx-control-inner-background: #530c0c");
			four_seven.setText(String.valueOf(sdk.getAnswers()[3][6]));
			incorrect++;
		}
		if (!four_eight.getText().equals(String.valueOf(sdk.getAnswers()[3][7]))){
			four_eight.setStyle("-fx-control-inner-background: #530c0c");
			four_eight.setText(String.valueOf(sdk.getAnswers()[3][7]));
			incorrect++;
		}
		if (!four_nine.getText().equals(String.valueOf(sdk.getAnswers()[3][8]))){
			four_nine.setStyle("-fx-control-inner-background: #530c0c");
			four_nine.setText(String.valueOf(sdk.getAnswers()[3][8]));
			incorrect++;
		}
		if (!five_one.getText().equals(String.valueOf(sdk.getAnswers()[4][0]))){
			five_one.setStyle("-fx-control-inner-background: #530c0c");
			five_one.setText(String.valueOf(sdk.getAnswers()[4][0]));
			incorrect++;
		}
		if (!five_two.getText().equals(String.valueOf(sdk.getAnswers()[4][1]))){
			five_two.setStyle("-fx-control-inner-background: #530c0c");
			five_two.setText(String.valueOf(sdk.getAnswers()[4][1]));
			incorrect++;
		}
		if (!five_three.getText().equals(String.valueOf(sdk.getAnswers()[4][2]))){
			five_three.setStyle("-fx-control-inner-background: #530c0c");
			five_three.setText(String.valueOf(sdk.getAnswers()[4][2]));
			incorrect++;
		}
		if (!five_four.getText().equals(String.valueOf(sdk.getAnswers()[4][3]))){
			five_four.setStyle("-fx-control-inner-background: #530c0c");
			five_four.setText(String.valueOf(sdk.getAnswers()[4][3]));
			incorrect++;
		}
		if (!five_five.getText().equals(String.valueOf(sdk.getAnswers()[4][4]))){
			five_five.setStyle("-fx-control-inner-background: #530c0c");
			five_five.setText(String.valueOf(sdk.getAnswers()[4][4]));
			incorrect++;
		}
		if (!five_six.getText().equals(String.valueOf(sdk.getAnswers()[4][5]))){
			five_six.setStyle("-fx-control-inner-background: #530c0c");
			five_six.setText(String.valueOf(sdk.getAnswers()[4][5]));
			incorrect++;
		}
		if (!five_seven.getText().equals(String.valueOf(sdk.getAnswers()[4][6]))){
			five_seven.setStyle("-fx-control-inner-background: #530c0c");
			five_seven.setText(String.valueOf(sdk.getAnswers()[4][6]));
			incorrect++;
		}
		if (!five_eight.getText().equals(String.valueOf(sdk.getAnswers()[4][7]))){
			five_eight.setStyle("-fx-control-inner-background: #530c0c");
			five_eight.setText(String.valueOf(sdk.getAnswers()[4][7]));
			incorrect++;
		}
		if (!five_nine.getText().equals(String.valueOf(sdk.getAnswers()[4][8]))){
			five_nine.setStyle("-fx-control-inner-background: #530c0c");
			five_nine.setText(String.valueOf(sdk.getAnswers()[4][8]));
			incorrect++;
		}
		if (!six_one.getText().equals(String.valueOf(sdk.getAnswers()[5][0]))){
			six_one.setStyle("-fx-control-inner-background: #530c0c");
			six_one.setText(String.valueOf(sdk.getAnswers()[5][0]));
			incorrect++;
		}
		if (!six_two.getText().equals(String.valueOf(sdk.getAnswers()[5][1]))){
			six_two.setStyle("-fx-control-inner-background: #530c0c");
			six_two.setText(String.valueOf(sdk.getAnswers()[5][1]));
			incorrect++;
		}
		if (!six_three.getText().equals(String.valueOf(sdk.getAnswers()[5][2]))){
			six_three.setStyle("-fx-control-inner-background: #530c0c");
			six_three.setText(String.valueOf(sdk.getAnswers()[5][2]));
			incorrect++;
		}
		if (!six_four.getText().equals(String.valueOf(sdk.getAnswers()[5][3]))){
			six_four.setStyle("-fx-control-inner-background: #530c0c");
			six_four.setText(String.valueOf(sdk.getAnswers()[5][3]));
			incorrect++;
		}
		if (!six_five.getText().equals(String.valueOf(sdk.getAnswers()[5][4]))){
			six_five.setStyle("-fx-control-inner-background: #530c0c");
			six_five.setText(String.valueOf(sdk.getAnswers()[5][4]));
			incorrect++;
		}
		if (!six_six.getText().equals(String.valueOf(sdk.getAnswers()[5][5]))){
			six_six.setStyle("-fx-control-inner-background: #530c0c");
			six_six.setText(String.valueOf(sdk.getAnswers()[5][5]));
			incorrect++;
		}
		if (!six_seven.getText().equals(String.valueOf(sdk.getAnswers()[5][6]))){
			six_seven.setStyle("-fx-control-inner-background: #530c0c");
			six_seven.setText(String.valueOf(sdk.getAnswers()[5][6]));
			incorrect++;
		}
		if (!six_eight.getText().equals(String.valueOf(sdk.getAnswers()[5][7]))){
			six_eight.setStyle("-fx-control-inner-background: #530c0c");
			six_eight.setText(String.valueOf(sdk.getAnswers()[5][7]));
			incorrect++;
		}
		if (!six_nine.getText().equals(String.valueOf(sdk.getAnswers()[5][8]))){
			six_nine.setStyle("-fx-control-inner-background: #530c0c");
			six_nine.setText(String.valueOf(sdk.getAnswers()[5][8]));
			incorrect++;
		}
		if (!seven_one.getText().equals(String.valueOf(sdk.getAnswers()[6][0]))){
			seven_one.setStyle("-fx-control-inner-background: #530c0c");
			seven_one.setText(String.valueOf(sdk.getAnswers()[6][0]));
			incorrect++;
		}
		if (!seven_two.getText().equals(String.valueOf(sdk.getAnswers()[6][1]))){
			seven_two.setStyle("-fx-control-inner-background: #530c0c");
			seven_two.setText(String.valueOf(sdk.getAnswers()[6][1]));
			incorrect++;
		}
		if (!seven_three.getText().equals(String.valueOf(sdk.getAnswers()[6][2]))){
			seven_three.setStyle("-fx-control-inner-background: #530c0c");
			seven_three.setText(String.valueOf(sdk.getAnswers()[6][2]));
			incorrect++;
		}
		if (!seven_four.getText().equals(String.valueOf(sdk.getAnswers()[6][3]))){
			seven_four.setStyle("-fx-control-inner-background: #530c0c");
			seven_four.setText(String.valueOf(sdk.getAnswers()[6][3]));
			incorrect++;
		}
		if (!seven_five.getText().equals(String.valueOf(sdk.getAnswers()[6][4]))){
			seven_five.setStyle("-fx-control-inner-background: #530c0c");
			seven_five.setText(String.valueOf(sdk.getAnswers()[6][4]));
			incorrect++;
		}
		if (!seven_six.getText().equals(String.valueOf(sdk.getAnswers()[6][5]))){
			seven_six.setStyle("-fx-control-inner-background: #530c0c");
			seven_six.setText(String.valueOf(sdk.getAnswers()[6][5]));
			incorrect++;
		}
		if (!seven_seven.getText().equals(String.valueOf(sdk.getAnswers()[6][6]))){
			seven_seven.setStyle("-fx-control-inner-background: #530c0c");
			seven_seven.setText(String.valueOf(sdk.getAnswers()[6][6]));
			incorrect++;
		}
		if (!seven_eight.getText().equals(String.valueOf(sdk.getAnswers()[6][7]))){
			seven_eight.setStyle("-fx-control-inner-background: #530c0c");
			seven_eight.setText(String.valueOf(sdk.getAnswers()[6][7]));
			incorrect++;
		}
		if (!seven_nine.getText().equals(String.valueOf(sdk.getAnswers()[6][8]))){
			seven_nine.setStyle("-fx-control-inner-background: #530c0c");
			seven_nine.setText(String.valueOf(sdk.getAnswers()[6][8]));
			incorrect++;
		}
		if (!eight_one.getText().equals(String.valueOf(sdk.getAnswers()[7][0]))){
			eight_one.setStyle("-fx-control-inner-background: #530c0c");
			eight_one.setText(String.valueOf(sdk.getAnswers()[7][0]));
			incorrect++;
		}
		if (!eight_two.getText().equals(String.valueOf(sdk.getAnswers()[7][1]))){
			eight_two.setStyle("-fx-control-inner-background: #530c0c");
			eight_two.setText(String.valueOf(sdk.getAnswers()[7][1]));
			incorrect++;
		}
		if (!eight_three.getText().equals(String.valueOf(sdk.getAnswers()[7][2]))){
			eight_three.setStyle("-fx-control-inner-background: #530c0c");
			eight_three.setText(String.valueOf(sdk.getAnswers()[7][2]));
			incorrect++;
		}
		if (!eight_four.getText().equals(String.valueOf(sdk.getAnswers()[7][3]))){
			eight_four.setStyle("-fx-control-inner-background: #530c0c");
			eight_four.setText(String.valueOf(sdk.getAnswers()[7][3]));
			incorrect++;
		}
		if (!eight_five.getText().equals(String.valueOf(sdk.getAnswers()[7][4]))){
			eight_five.setStyle("-fx-control-inner-background: #530c0c");
			eight_five.setText(String.valueOf(sdk.getAnswers()[7][4]));
			incorrect++;
		}
		if (!eight_six.getText().equals(String.valueOf(sdk.getAnswers()[7][5]))){
			eight_six.setStyle("-fx-control-inner-background: #530c0c");
			eight_six.setText(String.valueOf(sdk.getAnswers()[7][5]));
			incorrect++;
		}
		if (!eight_seven.getText().equals(String.valueOf(sdk.getAnswers()[7][6]))){
			eight_seven.setStyle("-fx-control-inner-background: #530c0c");
			eight_seven.setText(String.valueOf(sdk.getAnswers()[7][6]));
			incorrect++;
		}
		if (!eight_eight.getText().equals(String.valueOf(sdk.getAnswers()[7][7]))){
			eight_eight.setStyle("-fx-control-inner-background: #530c0c");
			eight_eight.setText(String.valueOf(sdk.getAnswers()[7][7]));
			incorrect++;
		}
		if (!eight_nine.getText().equals(String.valueOf(sdk.getAnswers()[7][8]))){
			eight_nine.setStyle("-fx-control-inner-background: #530c0c");
			eight_nine.setText(String.valueOf(sdk.getAnswers()[7][8]));
			incorrect++;
		}
		if (!nine_one.getText().equals(String.valueOf(sdk.getAnswers()[8][0]))){
			nine_one.setStyle("-fx-control-inner-background: #530c0c");
			nine_one.setText(String.valueOf(sdk.getAnswers()[8][0]));
			incorrect++;
		}
		if (!nine_two.getText().equals(String.valueOf(sdk.getAnswers()[8][1]))){
			nine_two.setStyle("-fx-control-inner-background: #530c0c");
			nine_two.setText(String.valueOf(sdk.getAnswers()[8][1]));
			incorrect++;
		}
		if (!nine_three.getText().equals(String.valueOf(sdk.getAnswers()[8][2]))){
			nine_three.setStyle("-fx-control-inner-background: #530c0c");
			nine_three.setText(String.valueOf(sdk.getAnswers()[8][2]));
			incorrect++;
		}
		if (!nine_four.getText().equals(String.valueOf(sdk.getAnswers()[8][3]))){
			nine_four.setStyle("-fx-control-inner-background: #530c0c");
			nine_four.setText(String.valueOf(sdk.getAnswers()[8][3]));
			incorrect++;
		}
		if (!nine_five.getText().equals(String.valueOf(sdk.getAnswers()[8][4]))){
			nine_five.setStyle("-fx-control-inner-background: #530c0c");
			nine_five.setText(String.valueOf(sdk.getAnswers()[8][4]));
			incorrect++;
		}
		if (!nine_six.getText().equals(String.valueOf(sdk.getAnswers()[8][5]))){
			nine_six.setStyle("-fx-control-inner-background: #530c0c");
			nine_six.setText(String.valueOf(sdk.getAnswers()[8][5]));
			incorrect++;
		}
		if (!nine_seven.getText().equals(String.valueOf(sdk.getAnswers()[8][6]))){
			nine_seven.setStyle("-fx-control-inner-background: #530c0c");
			nine_seven.setText(String.valueOf(sdk.getAnswers()[8][6]));
			incorrect++;
		}
		if (!nine_eight.getText().equals(String.valueOf(sdk.getAnswers()[8][7]))){
			nine_eight.setStyle("-fx-control-inner-background: #530c0c");
			nine_eight.setText(String.valueOf(sdk.getAnswers()[8][7]));
			incorrect++;
		}
		if (!nine_nine.getText().equals(String.valueOf(sdk.getAnswers()[8][8]))){
			nine_nine.setStyle("-fx-control-inner-background: #530c0c");
			nine_nine.setText(String.valueOf(sdk.getAnswers()[8][8]));
			incorrect++;
		}
		
		label.setText(incorrect+" incorrect answers..");
		
		
		
		
	}
	
	public void handleBtn(MouseEvent e) {
		button.setScaleX(1.3);
		button.setScaleY(1.3);
		button.setScaleZ(1.3);
	}
	
	public void handleBtnExit(MouseEvent e) {
		button.setScaleX(1);
		button.setScaleY(1);
		button.setScaleZ(1);
	}
}
