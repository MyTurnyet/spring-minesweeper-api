package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        long count = 0L;
        for (Cell cell : cells()) {
            if (cell.containsMine()) {

                Flaggable flaggedCell = (Flaggable) cell;
                if (!flaggedCell.hasFlag()) {
                    count++;
                }
            }
        }
        return (int) count;
    }

    public Grid flag(Flaggable cell) {
        Optional<Cell> cell2 = this.cellsList.stream().filter(cell1 -> cell1.hasSameLocationAs(cell)).findFirst();
        if (cell2.isEmpty()) {
            return this;
        }

        Flaggable cell3 = (Flaggable) cell2.get();
        cell3.addFlag();

        //get back new cell
        //loop through list
        //find if cell at same location
        //if not at same location
        //add old cell to new list
        //is at same location - add newly created cell
        //return new grid with changed list of cells

        return this;
    }
}
