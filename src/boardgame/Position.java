package boardgame;

import java.util.Objects;

public class Position {

	private Integer row;
	private Integer columns;
	public Position(Integer row, Integer columns) {
		super();
		this.row = row;
		this.columns = columns;
	}
	
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(columns, row);
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
		return Objects.equals(columns, other.columns) && Objects.equals(row, other.row);
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", column=" + columns + "]";
	}
	
	
}
