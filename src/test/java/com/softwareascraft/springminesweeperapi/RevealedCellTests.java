package com.softwareascraft.springminesweeperapi;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class RevealedCellTests {
    @Test
    void revealedCellShouldImplementCell() {
        Cell revealedCell = new RevealedCell();
        assertThat(revealedCell.isRevealed()).isTrue();
    }
}
