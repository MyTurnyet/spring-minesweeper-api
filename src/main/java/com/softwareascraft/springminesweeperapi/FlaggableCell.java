package com.softwareascraft.springminesweeperapi;

public abstract class FlaggableCell implements Cell {

    protected boolean showsFlag;

    public FlaggableCell(boolean showsFlag) {
        this.showsFlag = showsFlag;
    }

    @Override
    public abstract boolean containsMine();

    @Override
    public boolean isFlagged() {
        return this.showsFlag;
    }

    @Override
    public abstract Cell removeFlag();

    @Override
    public abstract Cell addFlag();
}
