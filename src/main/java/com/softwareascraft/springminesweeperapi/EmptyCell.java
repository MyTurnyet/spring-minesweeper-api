package com.softwareascraft.springminesweeperapi;

public class EmptyCell extends FlaggableCell<EmptyCell> {

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
    public EmptyCell removeFlag() {
        return new EmptyCell(false);
    }

    @Override
    public EmptyCell addFlag() {
        return new EmptyCell(true);
    }

}
