package com.SB.Quiz_Application.Controller;

import com.SB.Quiz_Application.Service.QuizService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@WebMvcTest(QuizController.class)
public class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private QuizService quizService;

    @Test
    public void testControllerNotNull() {
        assertNotNull(mockMvc);
    }

    @Test
    public void testQuizServiceInjected() {
        assertNotNull(quizService);
    }
}