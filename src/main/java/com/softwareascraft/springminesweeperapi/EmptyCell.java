package com.softwareascraft.springminesweeperapi;

public class EmptyCell implements Cell {

    private boolean showsFlag;

    public EmptyCell() {
        this(false);
    }

    public EmptyCell(boolean showsFlag) {
        this.showsFlag = showsFlag;
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public boolean isFlagged() {
        return this.showsFlag;
    }

    @Override
    public Cell removeFlag() {
        return new EmptyCell(false);
    }

    @Override
    public Cell addFlag() {
        return new EmptyCell(true);
    }
}
