package com.softwareascraft.springminesweeperapi.game.state;

public class GridCell {

    private final int rowIndex;
    private final int columnIndex;

    public GridCell(int row, int column) {
        this.rowIndex = row;
        this.columnIndex = column;
    }

    public boolean isAt(int row, int column) {
        return this.rowIndex == row && this.columnIndex == column;
    }
}
