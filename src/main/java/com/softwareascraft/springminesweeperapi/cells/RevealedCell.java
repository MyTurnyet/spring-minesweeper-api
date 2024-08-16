package com.softwareascraft.springminesweeperapi.cells;

public class RevealedCell implements Cell {

    private final int neighboringMinesCount;

    public RevealedCell(int neighboringMinesCount) {
        this.neighboringMinesCount = neighboringMinesCount;
    }

    public RevealedCell() {
        this(0);
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public boolean isRevealed() {
        return true;
    }

    public int adjacentMines() {
        return neighboringMinesCount;
    }
}
