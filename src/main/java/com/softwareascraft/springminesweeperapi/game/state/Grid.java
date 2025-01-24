package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Optional<Cell> cellAtSameLocation = this.cellsList.stream()
                .filter(
                        callToCheck -> callToCheck.hasSameLocationAs(cell)
                ).findFirst();
        if (cellAtSameLocation.isEmpty()) {
            return this;
        }

        Flaggable newCellWithFlag = ((Flaggable) cellAtSameLocation.get()).addFlag();
        ArrayList<Cell> replacementCells = cellsList.stream()
                .map(
                        existingCell -> cell.hasSameLocationAs(newCellWithFlag)
                                ? newCellWithFlag : existingCell)
                .collect(Collectors.toCollection(ArrayList::new));

        return new Grid(replacementCells);
    }
}
