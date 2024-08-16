package com.softwareascraft.springminesweeperapi.game.state;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class GridCellTests {

    @Test
    void createsWithCoordinates() {
        GridCell gridCell = new GridCell(0, 0);
        assertThat(gridCell.isAt(0, 0)).isTrue();
    }
    
    @Test
    void isNotInGivenRow() {
        GridCell gridCell = new GridCell(0, 0);
        assertThat(gridCell.isAt(1, 0)).isFalse();
    }
}