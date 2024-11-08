package com.softwareascraft.springminesweeperapi.cells;

public class EmptyCell extends FlaggableCell<EmptyCell> {

    public EmptyCell(int row, int column) {
        this(false, row, column);
    }

    public EmptyCell(boolean showsFlag, int row, int column) {
        super(showsFlag, row, column);
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public EmptyCell removeFlag() {
        return new EmptyCell(false, this.row, this.column);
    }

    @Override
    public EmptyCell addFlag() {
        return new EmptyCell(true, this.row, this.column);
    }

    @Override
    public boolean hasSameLocationAs(Cell otherCell) {
        return otherCell.isAt(this.row, this.column);
    }

}
