package com.softwareascraft.springminesweeperapi.cells;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class RevealedCellTests {

    @Test
    void shouldImplementCell() {
        Cell revealedCell = new RevealedCell();
        assertThat(revealedCell.isRevealed()).isTrue();
    }

    @Test
    void defaultAdjacentMineCountShouldBeZero() {
        RevealedCell revealedCell = new RevealedCell();
        assertThat(revealedCell.adjacentMines()).isEqualTo(0);
    }

    @Test
    void returnsPassedInAdjacentMineCount() {
        RevealedCell revealedCell = new RevealedCell(4);
        assertThat(revealedCell.adjacentMines()).isEqualTo(4);
    }

    @Test
    void isAtPassedInLocation() {
        Cell cell = new RevealedCell();
        assertThat(cell.isAt(0, 0)).isTrue();
    }
}
