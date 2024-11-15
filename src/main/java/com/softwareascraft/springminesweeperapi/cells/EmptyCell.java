package com.softwareascraft.springminesweeperapi.cells;

public class EmptyCell extends FlaggableCell implements Flaggable {

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
    public Flaggable removeFlag() {
        return new EmptyCell(false,this.row, this.column);
    }

    @Override
    public Flaggable addFlag() {
        return new EmptyCell(true,this.row, this.column);
    }

    @Override
    public boolean hasFlag() {
        return this.showsFlag;
    }
}
