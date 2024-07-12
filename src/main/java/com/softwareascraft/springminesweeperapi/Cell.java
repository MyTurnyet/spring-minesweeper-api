package com.softwareascraft.springminesweeperapi;

public class Cell {

    private boolean showsFlag;
    private boolean holdsMine;

    public Cell() {
        this(false, false);
    }

    public Cell(boolean showsFlag, boolean holdsMine) {
        this.showsFlag = showsFlag;
    }

    public boolean containsMine() {
        return this.holdsMine;
    }

    public void setMine() {
        this.holdsMine = true;
    }

    public boolean isFlagged() {
        return this.showsFlag;
    }

    public Cell removeFlag() {
        return new Cell(false, false);
    }

    public Cell addFlag() {
        return new Cell(true, false);
    }
}
