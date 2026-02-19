package boardgame;

import java.util.Objects;

public class Position {

	private Integer row;
	private Integer column;
	public Position(Integer row, Integer column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getColumn() {
		return column;
	}
	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(column, row);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return Objects.equals(column, other.column) && Objects.equals(row, other.row);
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", column=" + column + "]";
	}
	
	
}
