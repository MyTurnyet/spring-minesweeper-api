package com.softwareascraft.springminesweeperapi.game;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("Unit")
public class IndexControllerTests {

    @Test
    void testIndexControllerTests() {
        IndexController indexController = new IndexController();

        ModelAndView view = indexController.index();

        assertThat(view.getViewName()).isEqualTo("index");
        assertThat(view.getModelMap()).containsEntry("score", "0");
    }
}