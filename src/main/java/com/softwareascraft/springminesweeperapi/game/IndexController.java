package com.softwareascraft.springminesweeperapi.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/game")
public class IndexController {

    @GetMapping("")
    public ModelAndView index() {
        Map<String, String> attributes = Map.of("score", "5");
        return new ModelAndView("index", attributes);
    }

}
