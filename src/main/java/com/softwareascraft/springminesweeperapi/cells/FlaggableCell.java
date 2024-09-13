package com.softwareascraft.springminesweeperapi.cells;

public abstract class FlaggableCell<T> implements Cell {

    protected boolean showsFlag;
    protected final int adjacentMines;

    public FlaggableCell(boolean showsFlag, int adjacentMines) {
        this.showsFlag = showsFlag;
        this.adjacentMines = adjacentMines;
    }

    @Override
    public boolean isAt(int row, int column) {
        return true;
    }

    @Override
    public abstract boolean containsMine();

    public boolean isFlagged() {
        return this.showsFlag;
    }

    @Override
    public boolean isRevealed() {
        return false;
    }

    @Override
    public int adjacentMines() {
        return this.adjacentMines;
    }

    public abstract T removeFlag();

    public abstract T addFlag();
}
