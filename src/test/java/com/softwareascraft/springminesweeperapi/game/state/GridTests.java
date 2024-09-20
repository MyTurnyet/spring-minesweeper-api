package com.softwareascraft.springminesweeperapi.game.state;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class GridTests {
    @Test
    void oneByOneGrid_ReturnsListOf1Cell() {
        Grid grid = new Grid(1, 1);
        assertThat(grid.cells()).hasSize(1);

    }
}
