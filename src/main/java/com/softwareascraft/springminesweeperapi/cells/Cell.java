package com.softwareascraft.springminesweeperapi.cells;

public interface Cell {

    boolean containsMine();

    boolean isRevealed();

    boolean hasFlag();

    boolean isFlaggable();

    boolean isAt(int row, int column);

    boolean hasSameLocationAs(Cell otherCell);
}
