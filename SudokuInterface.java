import java.util.ArrayList;
import java.util.Random;

public interface SudokuInterface {

	
	public int[][] getSudoku();
	
	public int[][] getAnswers();
	
	public void boxPlacement();
	
	public void fillBox(int row, int col);
	
	public boolean fillRemaining(int i, int j);
	
	public void emptyCells(int num);
	
	public void printSudoku();	
}
