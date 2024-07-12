package com.softwareascraft.springminesweeperapi;

public class EmptyCell implements Cell {

    private boolean showsFlag;
    private boolean holdsMine;

    public EmptyCell() {
        this(false, false);
    }

    public EmptyCell(boolean showsFlag, boolean holdsMine) {
        this.showsFlag = showsFlag;
        this.holdsMine = holdsMine;
    }

    @Override
    public boolean containsMine() {
        return this.holdsMine;
    }

    @Override
    public boolean isFlagged() {
        return this.showsFlag;
    }

    @Override
    public Cell removeFlag() {
        return new EmptyCell(false, false);
    }

    @Override
    public Cell addFlag() {
        return new EmptyCell(true, false);
    }
}
