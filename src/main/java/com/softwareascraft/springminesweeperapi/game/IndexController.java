package com.softwareascraft.springminesweeperapi.game;

import org.springframework.web.servlet.ModelAndView;

public class IndexController {

    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
