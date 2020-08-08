public class DropGameHelper {
	private DropGamePiece[][] board;
	private int numRows, numCols;

	public DropGameHelper (int numRows, int numCols) {
		board = new DropGamePiece[numRows][numCols];
		this.numRows = numRows;
		this.numCols = numCols;

		for ( int r=0; r<numRows; r++ )
			for (int c=0; c<numCols; c++ )
				board[r][c] = null; 
	}

	public int numRows() {return numRows;}
	public int numCols() {return numCols;}

	public boolean isWinner (String p ) -
}
