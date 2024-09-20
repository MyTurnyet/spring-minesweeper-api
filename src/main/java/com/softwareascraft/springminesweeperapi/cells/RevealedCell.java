package com.softwareascraft.springminesweeperapi.cells;

public class RevealedCell implements Cell {

    private final int neighboringMinesCount;
    private final int row;
    private final int column;


    public RevealedCell(int neighboringMinesCount, int row, int column) {
        this.neighboringMinesCount = neighboringMinesCount;
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public boolean isRevealed() {
        return true;
    }


    public boolean isAt(int row, int column) {
        return this.row == row && this.column == column;
    }

    public int adjacentMines() {
        return neighboringMinesCount;
    }
}
