package com.softwareascraft.springminesweeperapi.cells;

public interface Flaggable extends Cell {

    Flaggable removeFlag();

    Flaggable addFlag();

    boolean hasFlag();
}
