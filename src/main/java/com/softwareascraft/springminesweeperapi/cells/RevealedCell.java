package com.softwareascraft.springminesweeperapi.cells;

public class RevealedCell implements Cell {

    private final int neighboringMinesCount;

    public RevealedCell() {
        this(0);
    }

    public RevealedCell(int neighboringMinesCount) {
        this.neighboringMinesCount = neighboringMinesCount;
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public boolean isRevealed() {
        return true;
    }

    // TODO
    @Override
    public boolean isAt(int row, int column) {
        return false;
    }

    public int adjacentMines() {
        return neighboringMinesCount;
    }
}
