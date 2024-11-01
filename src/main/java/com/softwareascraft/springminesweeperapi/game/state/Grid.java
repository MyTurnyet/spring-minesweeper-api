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

    public static Grid create(int rows, int columns, int mineCount) {
        ArrayList<Cell> cells = new ArrayList<>();
        int addedMines = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (addedMines < mineCount) {
                    addedMines++;
                    cells.add(new MineCell(false, row, column));
                    continue;
                }
                cells.add(new EmptyCell(false, row, column));

            }
        }
        Grid grid = new Grid(rows, columns, mineCount, cells);
        return grid;
    }

    private Grid(int rows, int columns, int mineCount, List<Cell> cells) {
        this.rows = rows;
        this.columns = columns;
        this.mineCount = mineCount;
        this.cellsList = cells;
    }

    public List<Cell> cells() {
        return cellsList;
    }

    public int remainingMines() {
        long count = cells().stream().filter(Cell::containsMine).count();
        return (int) count;
    }

    public Grid flag(Cell cell) {
        int remainingMines = remainingMines();
        if (cell.containsMine()) {
            remainingMines--;
        }
        //get flag cell at the same location

        Grid grid =  Grid.create(this.rows, this.columns, remainingMines);

        return grid;
    }
}
