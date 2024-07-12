package com.softwareascraft.springminesweeperapi;

public class MineCell implements Cell {

    @Override
    public boolean containsMine() {
        return true;
    }

    // TODO
    @Override
    public boolean isFlagged() {
        return false;
    }

    // TODO
    @Override
    public Cell removeFlag() {
        return null;
    }

    // TODO
    @Override
    public Cell addFlag() {
        return null;
    }
}
