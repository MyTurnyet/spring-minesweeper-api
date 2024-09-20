package com.softwareascraft.springminesweeperapi.game.state;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class GridTests {
    @Test
    void oneByOneGrid_ReturnsListOf1Cell() {
        Grid grid = new Grid(1, 1);
        grid.setup();
        assertThat(grid.cells()).hasSize(1);
    }
    @Test
    void twoByTwoGrid_ReturnsListOf4Cells() {
        Grid grid = new Grid(2, 2);
        grid.setup();
        assertThat(grid.cells()).hasSize(4);
    }

}
