package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.*;

import java.util.ArrayList;
import java.util.List;

public class Grid {

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
        return new Grid(cells);
    }

    private Grid(List<Cell> cells) {
        this.cellsList = cells;
    }

    public List<Cell> cells() {
        return cellsList;
    }

    public int remainingMines() {
        int count = 0;
        for (Cell cell : cells()) {
            if (!cell.containsMine()) {
                continue;
            }

            Flaggable flaggedCell = (Flaggable) cell;
            if (flaggedCell.hasFlag()) {
                continue;
            }
            count++;
        }
        return count;
    }

    public Grid flag(Flaggable cell) {

        ArrayList<Cell> newCellsToReturn = new ArrayList<>();
        for (Cell oldCell : cellsList) {
            if (!oldCell.isFlaggable()) {
                continue;
            }
            if (!oldCell.hasSameLocationAs(cell)) {
                newCellsToReturn.add(oldCell);
                continue;
            }
            Flaggable newCellWithFlag = ((Flaggable) oldCell).addFlag();
            newCellsToReturn.add(newCellWithFlag);
        }
        return new Grid(newCellsToReturn);
    }
}
