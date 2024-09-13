package com.softwareascraft.springminesweeperapi.cells;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class CellTests {

    @Test
    void newCellDoesNotContainMine() {
        Cell cell = new EmptyCell();
        boolean isMine = cell.containsMine();
        assertThat(isMine).isFalse();
    }

    @Test
    void newCellIsAtZeroZero() {
        Cell cell = new EmptyCell();
        assertThat(cell.isAt(0, 0)).isTrue();
    }

    @Test
    void setCellAsMine() {
        Cell cell = new MineCell();
        boolean isMine = cell.containsMine();
        assertThat(isMine).isTrue();
    }

    @Test
    void cellDoesNotShowFlagByDefault() {
        FlaggableCell cell = new EmptyCell();
        boolean isFlagged = cell.isFlagged();
        assertThat(isFlagged).isFalse();
    }

    @Test
    void cellShowsFlag() {
        FlaggableCell<EmptyCell> cell = new EmptyCell(true);
        boolean isFlagged = cell.isFlagged();
        assertThat(isFlagged).isTrue();
    }

    @Test
    void cellRemovesFlag() {
        FlaggableCell<EmptyCell> cell = new EmptyCell(true);
        FlaggableCell<EmptyCell> removedFlag = cell.removeFlag();
        boolean isFlagged = removedFlag.isFlagged();
        assertThat(isFlagged).isFalse();
    }

    @Test
    void cellAddsFlag() {
        FlaggableCell<EmptyCell> cell = new EmptyCell(false);
        FlaggableCell<EmptyCell> addFlag = cell.addFlag();
        boolean isFlagged = addFlag.isFlagged();
        assertThat(isFlagged).isTrue();
    }

    @Test
    void mineCellAddsFlag() {
        FlaggableCell<MineCell> cell = new MineCell(false);
        FlaggableCell<MineCell> addFlag = cell.addFlag();
        boolean isFlagged = addFlag.isFlagged();
        assertThat(isFlagged).isTrue();
        assertThat(addFlag.containsMine()).isTrue();
    }

    @Test
    void flaggableCellIsNotRevealed() {
        FlaggableCell<MineCell> cell = new MineCell(false);
        assertThat(cell.isRevealed()).isFalse();
    }
}
