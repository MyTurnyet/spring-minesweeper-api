package com.softwareascraft.springminesweeperapi;

public class Cell {

    private boolean holdsMine;

    public boolean containsMine() {
        return this.holdsMine;
    }

    public void setMine() {
        this.holdsMine = true;
    }

    public boolean isFlagged() {
        return false;
    }
}
