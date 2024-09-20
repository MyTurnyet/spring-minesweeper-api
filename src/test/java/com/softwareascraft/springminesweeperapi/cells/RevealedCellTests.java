package com.softwareascraft.springminesweeperapi.cells;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class RevealedCellTests {

    @Test
    void shouldImplementCell() {
        Cell revealedCell = new RevealedCell(0, 0, 0);
        assertThat(revealedCell.isRevealed()).isTrue();
    }

    @Test
    void defaultAdjacentMineCountShouldBeZero() {
        RevealedCell revealedCell = new RevealedCell(0, 0, 0);
        assertThat(revealedCell.adjacentMines()).isEqualTo(0);
    }

    @Test
    void returnsPassedInAdjacentMineCount() {
        RevealedCell revealedCell = new RevealedCell(4, 0, 0);
        assertThat(revealedCell.adjacentMines()).isEqualTo(4);
    }

    @Test
    void isAtPassedInLocation() {
        Cell cell = new RevealedCell(0, 0, 0);
        assertThat(cell.isAt(0, 0)).isTrue();
    }

    @Test
    void isNotInGivenRow() {
        Cell cell = new RevealedCell(0, 0, 0);
        assertThat(cell.isAt(1, 0)).isFalse();
    }

    @Test
    void isNotInGivenColumn() {
        Cell cell = new RevealedCell(0, 0, 0);
        assertThat(cell.isAt(0, 1)).isFalse();
    }
}
