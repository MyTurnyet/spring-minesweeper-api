package com.softwareascraft.springminesweeperapi.cells;

public class MineCell extends FlaggableCell {

    public MineCell(int row, int column) {
        this(false, row, column);
    }

    public MineCell(boolean showsFlag, int row, int column) {
        super(showsFlag, row, column);
    }

    @Override
    public boolean containsMine() {
        return true;
    }

}
