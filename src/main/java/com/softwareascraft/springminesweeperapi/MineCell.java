package com.softwareascraft.springminesweeperapi;

public class MineCell extends FlaggableCell {

    public MineCell() {
        this(false);
    }

    public MineCell(boolean showsFlag) {
        super(showsFlag);
    }

    @Override
    public boolean containsMine() {
        return true;
    }

    @Override
    public Cell removeFlag() {
        return new MineCell(false);
    }

    @Override
    public Cell addFlag() {
        return new MineCell(true);
    }

    @Override
    public boolean isRevealed() {
        return false;
    }
}
