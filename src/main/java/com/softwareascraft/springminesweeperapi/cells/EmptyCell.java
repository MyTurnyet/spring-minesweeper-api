package com.softwareascraft.springminesweeperapi.cells;

public class EmptyCell extends FlaggableCell<EmptyCell> {

    public EmptyCell() {
        this(false, 0);
    }

    public EmptyCell(int adjacentMines) {
        this(false, adjacentMines);
    }

    public EmptyCell(boolean showsFlag) {
        this(showsFlag, 0);
    }

    public EmptyCell(boolean showsFlag, int adjacentMines) {
        super(showsFlag, adjacentMines);
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
