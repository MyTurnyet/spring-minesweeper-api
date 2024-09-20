package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import com.softwareascraft.springminesweeperapi.cells.EmptyCell;
import com.softwareascraft.springminesweeperapi.cells.MineCell;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int rows;
    private final int columns;
    private List<Cell> cellsList;

    public Grid(int rows, int columns, int mineCount) {
        this.rows = rows;
        this.columns = columns;
    }

    public List<Cell> cells() {
        return cellsList;
    }

    public void setup() {
        cellsList = new ArrayList<>();
        for (int i = 0; i < (rows * columns); i++) {
            cellsList.add(new MineCell(false, 0, 0));
        }
    }
}
