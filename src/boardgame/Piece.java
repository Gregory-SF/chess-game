package boardgame;

public class Piece {
	protected Position position;
	protected Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
