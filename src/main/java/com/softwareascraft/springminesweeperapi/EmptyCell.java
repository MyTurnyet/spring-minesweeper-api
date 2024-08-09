package com.softwareascraft.springminesweeperapi;

public class EmptyCell extends FlaggableCell {

    public EmptyCell() {
        this(false);
    }

    public EmptyCell(boolean showsFlag) {
        super(showsFlag);
    }

    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public Cell removeFlag() {
        return new EmptyCell(false);
    }

    @Override
    public Cell addFlag() {
        return new EmptyCell(true);
    }

    @Override
    public boolean isRevealed() {
        return false;
    }

}
