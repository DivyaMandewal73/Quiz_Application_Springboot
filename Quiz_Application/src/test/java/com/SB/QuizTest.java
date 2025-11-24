package com.SB.Quiz_Application.Dao;

import com.SB.Quiz_Application.Model.Quiz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    @Test
    public void testQuizCreation() {
        Quiz quiz = new Quiz();
        quiz.setId(1);
        quiz.setTitle("Java Quiz");

        assertEquals(1, quiz.getId());
        assertEquals("Java Quiz", quiz.getTitle());
    }

    @Test
    public void testQuizNotNull() {
        Quiz quiz = new Quiz();
        assertNotNull(quiz);
    }

    @Test
    public void testQuizTitleSetter() {
        Quiz quiz = new Quiz();
        quiz.setTitle("Spring Boot Quiz");

        assertEquals("Spring Boot Quiz", quiz.getTitle());
    }
}