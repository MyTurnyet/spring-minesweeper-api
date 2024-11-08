package com.softwareascraft.springminesweeperapi.cells;

public class MineCell extends FlaggableCell<MineCell> {

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

    @Override
    public MineCell removeFlag() {
        return new MineCell(false, this.row, this.column);
    }

    @Override
    public MineCell addFlag() {
        return new MineCell(true, this.row, this.column);
    }

    @Override
    public boolean hasSameLocationAs(Cell otherCell) {
        return false;
    }

}
