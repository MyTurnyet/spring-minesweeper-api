package com.softwareascraft.springminesweeperapi.game;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Tag("Integration")
@WebMvcTest(controllers = IndexController.class)
public class IndexControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetEndpoint() throws Exception {
        MvcResult result = mockMvc.perform(get("/game"))
                .andExpect(status().isOk())
                .andReturn();
    }
}