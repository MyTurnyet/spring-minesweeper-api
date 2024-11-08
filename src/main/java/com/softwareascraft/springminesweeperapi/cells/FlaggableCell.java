package com.softwareascraft.springminesweeperapi.cells;

public abstract class FlaggableCell implements Cell, Flaggable {

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
    public void removeFlag() {
        this.showsFlag = false;
    }

    @Override
    public void addFlag() {
        this.showsFlag = true;
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

}
