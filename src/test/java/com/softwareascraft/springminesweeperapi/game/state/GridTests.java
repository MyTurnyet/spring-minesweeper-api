package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class GridTests {
    @Test
    void oneByOneGrid_ReturnsListOf1CellWith0Mines() {
        Grid grid = new Grid(1, 1, 0);
        grid.setup();
        int mineCount = (int) grid.cells().stream().filter(Cell::containsMine).count();
        assertThat(mineCount).isEqualTo(0);
        assertThat(grid.cells()).hasSize(1);
    }

    @Test
    void twoByTwoGrid_ReturnsListOf4CellsWith0Mines() {
        Grid grid = new Grid(2, 2, 0);
        grid.setup();
        int mineCount = (int) grid.cells().stream().filter(Cell::containsMine).count();
        assertThat(mineCount).isEqualTo(0);
        assertThat(grid.cells()).hasSize(4);
    }

    @Test
    void twoByTwoGrid_ReturnsListOf4CellsWith2Mines() {
        Grid grid = new Grid(2, 2, 2);
        grid.setup();
        int mineCount = (int) grid.cells().stream().filter(Cell::containsMine).count();
        assertThat(mineCount).isEqualTo(2);
        assertThat(grid.cells()).hasSize(4);
    }

    @Test
    void returnsListWith1MineCell() {
        Grid grid = new Grid(1, 1, 1);
        grid.setup();
        int mineCount = (int) grid.cells().stream().filter(Cell::containsMine).count();
        assertThat(mineCount).isEqualTo(1);
    }

    @Test
    void twoByTwoGridWithOneMine_ReturnsOneUnflaggedMine() {
        Grid grid = new Grid(2, 2, 1);
        grid.setup();
        assertThat(grid.remainingMines()).isEqualTo(1);
    }

    @Test
    void twoByTwoGridWithTwoMines_ReturnsTwoUnflaggedMines() {
        Grid grid = new Grid(2, 2, 2);
        grid.setup();
        assertThat(grid.remainingMines()).isEqualTo(2);
    }

    @Test
    void cellsKnowTheirCoordinates() {
        Grid grid = new Grid(2, 2, 1);
        grid.setup();
        Cell cell0 = grid.cells().get(0);
        Cell cell1 = grid.cells().get(1);
        Cell cell2 = grid.cells().get(2);
        Cell cell3 = grid.cells().get(3);
        assertThat(cell0.isAt(0, 0)).isTrue();
        assertThat(cell1.isAt(0, 1)).isTrue();
        assertThat(cell2.isAt(1, 0)).isTrue();
        assertThat(cell3.isAt(1, 1)).isTrue();
    }
}
