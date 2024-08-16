package com.softwareascraft.springminesweeperapi.cells;

public class MineCell extends FlaggableCell<MineCell> {

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
    public MineCell removeFlag() {
        return new MineCell(false);
    }

    @Override
    public MineCell addFlag() {
        return new MineCell(true);
    }

}
