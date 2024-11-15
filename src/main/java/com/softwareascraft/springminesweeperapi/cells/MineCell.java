package com.softwareascraft.springminesweeperapi.cells;

public class MineCell extends FlaggableCell implements Flaggable {

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
    public Flaggable removeFlag() {
        return new MineCell(false,this.row, this.column);
    }

    @Override
    public Flaggable addFlag() {
        return new MineCell(true,this.row, this.column);
    }

    @Override
    public boolean hasFlag() {
        return this.showsFlag;
    }
}
