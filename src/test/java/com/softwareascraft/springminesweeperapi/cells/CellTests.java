package com.softwareascraft.springminesweeperapi.cells;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class CellTests {

    @Test
    void emptyCellDoesNotContainMine() {
        Cell cell = new EmptyCell(0, 0);
        boolean isMine = cell.containsMine();
        assertThat(isMine).isFalse();
    }

    @Test
    void mineCellContainsMine() {
        Cell cell = new MineCell(0, 0);
        boolean isMine = cell.containsMine();
        assertThat(isMine).isTrue();
    }

    @Test
    void isAtPassedInLocation() {
        Cell cell = new EmptyCell(0, 0);
        assertThat(cell.isAt(0, 0)).isTrue();
    }

    @Test
    void isNotInGivenRow() {
        Cell gridCell = new EmptyCell(0, 0);
        assertThat(gridCell.isAt(1, 0)).isFalse();
    }

    @Test
    void isNotInGivenColumn() {
        Cell gridCell = new EmptyCell(0, 0);
        assertThat(gridCell.isAt(0, 1)).isFalse();
    }

    @Test
    void doesNotShowFlagByDefault() {
        FlaggableCell cell = new EmptyCell(0, 0);
        assertThat(cell.hasFlag()).isFalse();
    }

    @Test
    void cellShowsFlag() {
        FlaggableCell cell = new EmptyCell(true, 0, 0);
        assertThat(cell.hasFlag()).isTrue();
    }

    @Test
    void cellRemovesFlag() {
        FlaggableCell cell = new EmptyCell(true, 0, 0);
        cell.removeFlag();
        assertThat(cell.hasFlag()).isFalse();
    }

    @Test
    void cellAddsFlag() {
        FlaggableCell cell = new EmptyCell(false, 0, 0);
        cell.addFlag();
        assertThat(cell.hasFlag()).isTrue();
    }

    @Test
    void mineCellAddsFlag() {
        FlaggableCell cell = new MineCell(false, 0, 0);
        cell.addFlag();
        assertThat(cell.hasFlag()).isTrue();
        assertThat(cell.containsMine()).isTrue();
    }

    @Test
    void flaggableCellIsNotRevealed() {
        FlaggableCell cell = new MineCell(false, 0, 0);
        assertThat(cell.isRevealed()).isFalse();
    }

    @Test
    void cellsAreAtSameLocation() {
        Cell cell1 = new EmptyCell(0, 0);
        Cell cell2 = new EmptyCell(0, 0);
        assertThat(cell1.hasSameLocationAs(cell2)).isTrue();
    }

    @Test
    void cellsAreNotAtSameLocation() {
        Cell cell1 = new EmptyCell(1, 0);
        Cell cell2 = new EmptyCell(0, 0);
        assertThat(cell1.hasSameLocationAs(cell2)).isFalse();
    }

    @Test
    void cellIsFlaggable() {
        FlaggableCell cell = new EmptyCell(0, 0);
        assertThat(cell.isFlaggable()).isTrue();
    }
}
