package com.SB.Quiz_Application.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class QuizServiceTest {

    @Autowired
    private QuizService quizService;

    @Test
    public void testQuizServiceNotNull() {
        assertNotNull(quizService);
    }

    @Test
    public void testQuizServiceLoads() {
        assertDoesNotThrow(() -> {
            assertNotNull(quizService);
        });
    }
}