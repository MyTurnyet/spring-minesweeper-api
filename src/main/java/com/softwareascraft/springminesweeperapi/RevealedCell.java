package com.softwareascraft.springminesweeperapi;

public class RevealedCell implements Cell {
    @Override
    public boolean containsMine() {
        return false;
    }

    @Override
    public boolean isRevealed() {
        return true;
    }
}
