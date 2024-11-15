package com.softwareascraft.springminesweeperapi.cells;

abstract class FlaggableCell {

    protected boolean showsFlag;
    protected final int row;
    protected final int column;

    public FlaggableCell(boolean showsFlag, int row, int column) {
        this.showsFlag = showsFlag;
        this.row = row;
        this.column = column;
    }

    public boolean isAt(int row, int column) {
        return this.row == row && this.column == column;
    }


    public boolean isRevealed() {
        return false;
    }

    public boolean isFlaggable() {
        return true;
    }

    public boolean hasSameLocationAs(Cell otherCell) {
        return otherCell.isAt(this.row, this.column);
    }
}
