package olumofe.raphael.frontEnd;

import net.minidev.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.WebApplicationContext;
import starterProject.domain.Car;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerTest {
    @LocalServerPort
    private int port;



    @Autowired
    private TestRestTemplate restTemplate;

@Test
    public void sep(){assert(true);}

   @Autowired
    CarController carController;


    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() {
//        assertEquals(carNewList, carController.createCarList(carController.carNewList));
    }


    @Test
    public void checkObjectIsCreated() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/cars").toString(), String.class);
       // assertEquals("Hello Controller", response.getBody());
        assertNotNull(response.getBody());

    }

    @Test
    public void checkMapIsreturned()  throws  Exception {
        ResponseEntity <String> response = restTemplate.getForEntity(
                new URL("http//localhost:" + port + "car").toString(),String.class);
        assertNotNull(response.getBody());




    }

//    @Test
//    public void checkReturn() throws Exception {,
//        ResponseEntity<String> response = restTemplate.getForEntity(
//                new URL("http://localhost:" + port + "/cars").toString(), String.class);
//    HashMap<>
//         String testDats = new JSONObject(;
//
//
//




    }




//    private WebApplicationContext wac;
//
//    private MockMvc mockMvc;
//    @Before
//    public void setup() throws Exception {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    }

//    @Test
//    public void givenWac_whenServletContext_thenItProvidesGreetController() {
//        ServletContext servletContext = wac.getServletContext();
//
//        Assert.assertNotNull(servletContext);
//        Assert.assertTrue(servletContext instanceof MockServletContext);
//        Assert.assertNotNull(wac.getBean("CarController"));
//    }

//    @Test
//    public void givenGreetURIWithPost_whenMockMVC_thenVerifyResponse() {
//        this.mockMvc.perform(post("/cars")).andDo(print())
//                .andExpect(status().isOk()).andExpect(content()
//                .contentType("application/json;charset=UTF-8"))
//                .andExpect(jsonPath("$.message").value("Hello World!!!"));
//    }
//
//    private RequestBuilder post(String s) {
//    }
//
//
//
//

//    @Test
//    void car() {
//    }
