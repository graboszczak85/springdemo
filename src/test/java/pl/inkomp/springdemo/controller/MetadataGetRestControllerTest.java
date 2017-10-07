package pl.inkomp.springdemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.inkomp.springdemo.model.Metadata;
import pl.inkomp.springdemo.repository.MetadataRepository;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MetadataGetRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private MetadataRepository metadataRepository;

    @Before
    public void init() {
        Metadata dummy = new Metadata();
        dummy.setMetadata("Dummy metadata");
        metadataRepository.save(dummy);
    }

    @Test
    public void shouldGetMetadata() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/metadatas").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"metadata\":\"Dummy metadata\"}]")));
    }

}