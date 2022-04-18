package my.phonepe.cab.management.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.entity.User;
import my.phonepe.cab.management.services.UserService;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserService userService;

    private final String URL = "/user/";

    @Test
    public void testRegisteruser() throws Exception {

        // prepare data and mock's behaviour
        Location location = new Location();
        location.setLocation_id(159);
        User user = new User();

        user.setBase_location(location);

        user.setActive("Y");
        user.setAge(37);
        user.setDob(new Date("1988-12-24"));
        user.setEmail_id("abc@gmail.com");
        user.setFirst_name("Prasad");
        user.setLast_name("Deshpande");
        user.setGender("Male");
        user.setMobile_number(9970046406L);
        user.setUser_type("DRIVER");

        when(userService.addOrUpdate(any(User.class))).thenReturn(user);

        // Execute
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(my.phonepe.cab.management.TestUtils.objectToJson(user))).andReturn();

        // verify
        int status = result.getResponse().getStatus();
        assertEquals("Incorrect Response Status", HttpStatus.CREATED.value(), status);

        // verify that service method was called once
        verify(userService).addOrUpdate(any(User.class));

        User resultUser = my.phonepe.cab.management.TestUtils.jsonToObject(result.getResponse().getContentAsString(),
                User.class);
        assertNotNull(resultUser);
        assertEquals("Prasad", resultUser.getFirst_name().toString());
    }
}
