package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public ChessPiece(Board board) {
		super(board);
	}

	public Color getColor() {
		return color;
	}
}
