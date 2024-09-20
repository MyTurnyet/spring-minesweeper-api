package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import com.softwareascraft.springminesweeperapi.cells.EmptyCell;
import com.softwareascraft.springminesweeperapi.cells.FlaggableCell;

import java.util.Collections;
import java.util.List;

public class Grid {

    public Grid(int rows, int columns) {

    }

    public List<Cell> cells() {
        return List.of(new EmptyCell(false,0,0));
    }
}
