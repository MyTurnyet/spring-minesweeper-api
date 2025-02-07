package com.softwareascraft.springminesweeperapi.game;

import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class IndexController {

    public ModelAndView index() {
        Map<String, String> attributes = Map.of("score", "0");
        return new ModelAndView("index", attributes);
    }

}
