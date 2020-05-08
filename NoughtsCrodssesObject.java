public class NoughtsCrossesObject
{
	// Instance Variables
	private string[][] board;
	private int turns;

	// Constructor
	public NoughtsCrossesObject()
	{
		boards = new String[3][3];
		turns = 0;

		for ( int r = 0; r < 3; r++ ) {
			for ( int c = 0; c < 3; c++) {
				board[r][c] = " ";
			}
		}
		
	// Accessor Methods
	public boolean isWinner( String p ) {
		// top row
		if ( winCheck(p, 0, 0, 0, 1, 0, 2) ) return true;
		// middle row
		if ( winCheck(p, 1, 0, 1, 1, 1, 2) ) return true;
		// bottom row
		if ( winCheck(p, 2, 0, 2, 1, 2, 2) ) return true;
		// left column
		if ( winCheck(p, 0, 0, 1, 0, 2, 0) ) return true;
		// middle colum
		if ( winCheck(p, 0, 1, 1, 1, 2, 1) ) return true;
		// right column
		if ( winCheck(p, 0, 2, 1, 2, 2, 2) ) return true;
		// diagonal top-to bottom-right
		if ( winCheck(p, 0, 0, 1, 1, 2, 2) ) return true;
		// diagonal bottom-left to top-right
		if ( winCheck(p, 2, 0, 1, 1, 0, 2) ) return true;

		return false;
	}

	private boolean winCheck( String p, int a, int b, int c, int d, int e, int f) {
		return board[a][b].equals(board[c][d]) 
				&& board[a][b].equals(board[e][f]);
	}
