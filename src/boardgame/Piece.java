package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}

	
}
