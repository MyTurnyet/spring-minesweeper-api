package com.softwareascraft.springminesweeperapi.cells;

public abstract class FlaggableCell<T> implements Cell {

    protected boolean showsFlag;
    protected final int row;
    protected final int column;

    public FlaggableCell(boolean showsFlag, int row, int column) {
        this.showsFlag = showsFlag;
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean isAt(int row, int column) {
        return this.row == row && this.column == column;
    }

    @Override
    public boolean isRevealed() {
        return false;
    }

    @Override
    public boolean hasFlag() {
        return this.showsFlag;
    }

    @Override
    public boolean isFlaggable() {
        return true;
    }

    public abstract T removeFlag();

    public abstract T addFlag();
}
