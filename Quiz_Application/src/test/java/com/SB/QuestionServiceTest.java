package com.SB.Quiz_Application.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class QuestionServiceTest {

    @Autowired
    private QuestionService questionService;

    @Test
    public void testQuestionServiceNotNull() {
        assertNotNull(questionService);
    }

    @Test
    public void testGetAllQuestions() {
        assertDoesNotThrow(() -> {
            questionService.getAllQuestions();
        });
    }

    @Test
    public void testGetQuestionsByCategory() {
        assertDoesNotThrow(() -> {
            questionService.getQuestionsByCategory("Java");
        });
    }
}