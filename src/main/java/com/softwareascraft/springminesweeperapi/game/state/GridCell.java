package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import com.softwareascraft.springminesweeperapi.cells.EmptyCell;
import com.softwareascraft.springminesweeperapi.cells.MineCell;

public class GridCell {

    public static GridCell withMine(int row, int column){
        return new GridCell(row, column, new MineCell());
    }
    public static GridCell empty(int row, int column){
        return new GridCell(row, column, new EmptyCell());
    }
    private final int rowIndex;
    private final int columnIndex;
    private final Cell cell;

    private GridCell(int row, int column) {
        this(row, column, new EmptyCell());
    }

    private GridCell(int row, int column, Cell cell) {
        this.rowIndex = row;
        this.columnIndex = column;
        this.cell = cell;
    }


    public boolean isAt(int row, int column) {
        return this.rowIndex == row && this.columnIndex == column;
    }

    public boolean containsMine() {
        return this.cell.containsMine();
    }
}
