import java.util.ArrayList;
import java.util.Random;

import javafx.scene.control.TextField;



/********************************************************************
 * @title Program for Sudoku Generator								*
 * @author Ankur Trisal												*
 * 																	*
 * Referenced from 													*
 * {@link https://www.geeksforgeeks.org/program-sudoku-generator/}  *
 ********************************************************************/

public class Sudoku implements SudokuInterface{

	private static int N = 9;			//Size of row and col
	private int[][] sudoku;	//Sudoku table
	private int SRN;		//SQRT of N - used to fill the diagnol boxes
	private int K;
	private int[][] problem;
	public Sudoku(int cells) {
		this.K = cells;
		sudoku = new int[N][N];
		SRN = (int) Math.sqrt(N);
		boxPlacement();
		fillRemaining(0, SRN);
		
		emptyCells(K);
	}
	
	public int[][] getSudoku(){
		return this.problem;
	}
	
	public int[][] getAnswers(){
		return this.sudoku;
	}
	
	public void boxPlacement() {
	
		for (int i = 0; i < N; i = i + SRN)
		{
			fillBox(i, i);
		}
	}
	
	public void fillBox(int row, int col) {
		
		Random rand = new Random();
		int num;
		int index;
		
		ArrayList<Integer> nums = new ArrayList<>(9);
		for (int k = 1; k <= N; k++)
		{
			nums.add(k);
		}
		int p = 9;
		for (int i = 0; i < SRN; i++)
		{
			for (int j = 0; j < SRN; j++)
			{
				
				
				
				do {
					
					index = rand.nextInt(p);
					num = nums.get(index);
				
				}while (!isEligible(row, col, num));
				nums.remove(index);
				p--;
				/*do {
					
					num = rand.nextInt(8) + 1;
					
				}while (!isEligible(row, col, num));
				*/	
				sudoku[row+i][col+j] = num;
			}
		}
	}
	
	
	
	private void deleteBox(int row, int col) {
		
		for (int i = 0; i < SRN; i++)
		{
			for (int j = 0; j < SRN; j++)
			{
				sudoku[row+i][col+j] = 0;
			}
		}
	}
	
	public boolean fillRemaining(int i, int j) 
    { 
		
        if (j >= N && i < N-1) 
        { 
            i = i + 1; 
            j = 0; 
        } 
        
        if (i>=N && j>=N) 
        {
        	return true; 
        }
  
        if (i < SRN) 
        { 
            if (j < SRN) 
                j = SRN; 
        } 
        else if (i < N-SRN) 
        { 
            if (j==(int)(i/SRN)*SRN) 
                j =  j + SRN; 
        } 
        else
        { 
            if (j == N-SRN) 
            { 
                i = i + 1; 
                j = 0; 
                if (i>=N)
                {
                	return true; 
                }               
            } 
        } 
  
        for (int num = 1; num<=N; num++) 
        { 
            if (rowEligible(i, num) && colEligible(j, num) && isEligible(i-i%SRN, j-j%SRN, num)) 
            { 
                sudoku[i][j] = num; 
                if (fillRemaining(i, j+1)) 
                {
                	  return true; 
                	  
                }
                  
                sudoku[i][j] = 0; 
            } 
        } 
        return false; 
    }
	
	
	
	private boolean isEligible(int rowStart, int colStart, int num) {
		
		for (int i = 0; i<SRN; i++)
		{
			for (int j = 0; j<SRN; j++)
			{
				if (sudoku[rowStart+i][colStart+j]==num)
				{
					return false; 
				}               
			}
		}
        return true; 
	}
	
	private boolean rowEligible(int row, int num){
		
		for (int i = 0; i < N; i++)
		{
			if (sudoku[row][i] == num)
			{
				return false;
			}
		}
		return true;
	}
	
	private boolean colEligible(int col, int num) {
		
		for (int i = 0; i < N; i++)
		{
			if (sudoku[i][col] == num)
			{
				return false;
			}
		}
		return true;
	}
	
	public void emptyCells(int num) {
		Random rand = new Random();
		problem = new int[9][9];
		for (int i = 0; i < sudoku.length; i++)
		{
			for ( int j = 0; j < sudoku.length; j++)
			{
				problem[i][j] = sudoku[i][j];
			}
		}
		int count = num; 
        while (count != 0) 
        { 
            int cellId = rand.nextInt(N*N); 
  
            // System.out.println(cellId); 
            // extract coordinates i  and j 
            int i = (cellId/N); 
            int j = cellId%9; 
            /*if (j != 0) 
                j = j - 1; 
  			*/
            // System.out.println(i+" "+j); 
            if (problem[i][j] != 0) 
            { 
                count--; 
                problem[i][j] = 0; 
            } 
        } 
	}
	
	public void printSudoku(){
		
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				System.out.print(sudoku[i][j]);
			}
			System.out.println();
		}
	}
}
