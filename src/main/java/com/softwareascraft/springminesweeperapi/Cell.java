package com.softwareascraft.springminesweeperapi;

public interface Cell {
    boolean containsMine();

    boolean isFlagged();

    Cell removeFlag();

    Cell addFlag();

    boolean isRevealed();
}
