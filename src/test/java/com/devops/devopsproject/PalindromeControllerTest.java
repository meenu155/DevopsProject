package com.devops.devopsproject; // Declares the package for this test class

// Import statements required for testing
import org.junit.jupiter.api.Test; // JUnit 5 annotation for test methods
import org.springframework.beans.factory.annotation.Autowired; // Used to inject dependencies
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; // Specialized test for Spring MVC controllers
import org.springframework.test.web.servlet.MockMvc; // Main class for performing HTTP requests in tests
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders; // Utility for building HTTP requests
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; // Checks HTTP status codes
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath; // Checks JSON response body
import static org.hamcrest.Matchers.is; // Used to assert expected values in JSON


@WebMvcTest(PalindromeController.class)
public class PalindromeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPalindrome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/checkpalindrome/radar"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.input", is("radar")))
                .andExpect(jsonPath("$.isPalindrome", is(true)));
    }
    @Test
    public void testPalindromeHomePage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api"))
                .andExpect(status().isOk());
    }

}

