package my.phonepe.cab.management.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import my.phonepe.cab.management.services.TripService;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(TripController.class)
public class TripControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    TripService tripService;

    private final String URL = "/user/start";

    @Test
    public void testStartTrip() throws Exception {

    }
}
