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

}
