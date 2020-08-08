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

	public boolean isWinner (String p ) {
		for ( int r=0; r<numRows; r++)
			for ( int c=0; c<numCols; c++)
				if ( winCheck(p, board[r][c]))
					return true;
		return false;
	}

	private boolean winCheck (String p, DropGamePiece piece) {
		if ( piece == null)
			return false;
		if ( !p.equals(piece.getSymbol()) )
			return false;
		Location loc = piece.getLocation();
		if ( ! isValid(loc) )
			return false;

		Location left, right, below, above;

		int adjacentCount = 0;
		left = loc.left();
		right = loc.right();
		below = loc.below();
		above = loc.above();

	}
}
