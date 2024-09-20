package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import com.softwareascraft.springminesweeperapi.cells.EmptyCell;
import com.softwareascraft.springminesweeperapi.cells.MineCell;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private final int rows;
    private final int columns;
    private final int mineCount;
    private List<Cell> cellsList;

    public Grid(int rows, int columns, int mineCount) {
        this.rows = rows;
        this.columns = columns;
        this.mineCount = mineCount;
    }

    public List<Cell> cells() {
        return cellsList;
    }

    public void setup() {
        cellsList = new ArrayList<>();
        int numberOfMinesAdded = 0;
        for (int i = 0; i < (rows * columns); i++) {
            createCellAt(0, 0, numberOfMinesAdded);
        }
    }

    private void createCellAt(int row, int column, int numberOfMinesAdded) {
        if (numberOfMinesAdded < mineCount) {
            cellsList.add(new MineCell(false, row, column));
            return;
        }
        cellsList.add(new EmptyCell(false, row, column));

    }
}
