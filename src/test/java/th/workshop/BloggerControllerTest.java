package th.workshop;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by DellLaptop on 15/08/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class BloggerControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webAppCtx;

    @Before
    public void setup(){
        mockMvc = webAppContextSetup(this.webAppCtx).build();
    }

    @Test
    public void searchBlog() throws Exception {
        this.mockMvc.perform(get("/blog")).andExpect(status().isOk());
    }


}
