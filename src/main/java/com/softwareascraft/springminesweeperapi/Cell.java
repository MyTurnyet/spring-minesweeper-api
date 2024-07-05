package com.softwareascraft.springminesweeperapi;

public class Cell {
    private boolean isMine;

    public boolean isMine() {
        return this.isMine;
    }

    public void setMine() {
        this.isMine = true;
    }
}
