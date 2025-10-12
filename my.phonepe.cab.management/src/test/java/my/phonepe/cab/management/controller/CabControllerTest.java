package my.phonepe.cab.management.controller;

import my.phonepe.cab.management.services.CabService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(CabController.class)
public class CabControllerTest {
    @Autowired private MockMvc mockMvc;

    @MockBean CabService cabService;

    private final String REGISTER_URL = "/cab/register";

    private final String BOOK_URL = "/cab/book";

    private final String DEACTIVATE_URL = "/cab/deactivate";

    private final String IDLETIME_URL = "/cab/idletime";

    @Test
    public void testRegisterCab() throws Exception {}

    @Test
    public void testBookCab() throws Exception {}

    @Test
    public void testDeactivateCab() throws Exception {}

    @Test
    public void testGetIdleTime() throws Exception {}
}
