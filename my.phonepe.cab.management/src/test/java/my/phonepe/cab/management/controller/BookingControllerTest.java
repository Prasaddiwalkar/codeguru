package my.phonepe.cab.management.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import my.phonepe.cab.management.services.BookingService;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(BookingController.class)
public class BookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    BookingService bookingService;

//    private final String URL = "/user/register";
//
//    @Test
//    public void testRegisteruser() throws Exception {
//
//    }
}
