package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Grid {

    private final int rows;
    private final int columns;
    private final List<Cell> cellsList;

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
        return new Grid(rows, columns, cells);
    }

    private Grid(int rows, int columns, List<Cell> cells) {
        this.rows = rows;
        this.columns = columns;
        this.cellsList = cells;
    }

    public List<Cell> cells() {
        return cellsList;
    }

    public int remainingMines() {
        long count = cells().stream().filter(Cell::containsMine).count();
        return (int) count;
    }

    public Grid flag(FlaggableCell cell) {
        Optional<Cell> cell2 = this.cellsList.stream().filter(cell1 -> cell1.hasSameLocationAs(cell)).findFirst();
        if (cell2.isEmpty()) {
            return this;
        }

        FlaggableCell cell3 = (FlaggableCell) cell2.get();
        cell3.addFlag();
        return this;
    }
}
