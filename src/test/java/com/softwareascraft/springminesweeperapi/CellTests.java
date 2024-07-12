package com.softwareascraft.springminesweeperapi;

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
    void setCellAsMine() {
        Cell cell = new MineCell();
        boolean isMine = cell.containsMine();
        assertThat(isMine).isTrue();
    }

    @Test
    void cellDoesNotShowFlagByDefault() {
        Cell cell = new EmptyCell();
        boolean isFlagged = cell.isFlagged();
        assertThat(isFlagged).isFalse();
    }

    @Test
    void cellShowsFlag() {
        Cell cell = new EmptyCell(true);
        boolean isFlagged = cell.isFlagged();
        assertThat(isFlagged).isTrue();
    }

    @Test
    void cellRemovesFlag() {
        Cell cell = new EmptyCell(true);
        Cell removedFlag = cell.removeFlag();
        boolean isFlagged = removedFlag.isFlagged();
        assertThat(isFlagged).isFalse();
    }

    @Test
    void cellAddsFlag() {
        Cell cell = new EmptyCell(false);
        Cell addFlag = cell.addFlag();
        boolean isFlagged = addFlag.isFlagged();
        assertThat(isFlagged).isTrue();
    }
}
