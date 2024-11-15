package com.softwareascraft.springminesweeperapi.cells;

public class EmptyCell extends FlaggableCell {

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

}
