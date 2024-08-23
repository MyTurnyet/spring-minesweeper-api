package com.softwareascraft.springminesweeperapi.game.state;

import com.softwareascraft.springminesweeperapi.cells.Cell;
import com.softwareascraft.springminesweeperapi.cells.EmptyCell;
import com.softwareascraft.springminesweeperapi.cells.MineCell;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class GridCellTests {

    @Test
    void createsWithCoordinates() {
        GridCell gridCell = GridCell.empty(0,0);
        assertThat(gridCell.isAt(0, 0)).isTrue();
    }

    @Test
    void isNotInGivenRow() {
        GridCell gridCell = GridCell.empty(0, 0);
        assertThat(gridCell.isAt(1, 0)).isFalse();
    }

    @Test
    void isNotInGivenColumn() {
        GridCell gridCell = GridCell.empty(0, 0);
        assertThat(gridCell.isAt(0, 1)).isFalse();
    }

    @Test
    void gridCellWithEmptyCellDoesNotContainMine() {
        GridCell gridCell = GridCell.empty(0, 0);
        assertThat(gridCell.containsMine()).isFalse();
    }

    @Test
    void gridCellWithMineCellContainsMine() {
        GridCell gridCell = GridCell.withMine(0, 0);
        assertThat(gridCell.containsMine()).isTrue();
    }

    @Test
    void gridCellWithRevealedCellIsRevealed() {
        GridCell gridCell = GridCell.withRevealedCell(0,0);
        assertThat(gridCell.isRevealed()).isTrue();
    }

//    @Test
//    void gridCellWithMineCellContainsMine() {
//        GridCell gridCell = GridCell.withMine(0, 0);
//        assertThat(gridCell.containsMine()).isTrue();
//    }
}
