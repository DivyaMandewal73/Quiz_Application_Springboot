package com.SB.Quiz_Application.Dao;

import com.SB.Quiz_Application.Model.Question;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    public void testQuestionCreation() {
        Question question = new Question();
        question.setId(1);
        question.setQuestionTitle("What is Java?");
        question.setCategory("Programming");
        question.setDifficultylevel("Easy");  // Changed: setDifficultyLevel → setDifficultylevel
        question.setOption1("A programming language");
        question.setOption2("A coffee");
        question.setOption3("An island");
        question.setOption4("A framework");
        question.setRightAnswer("A programming language");

        assertEquals(1, question.getId());
        assertEquals("What is Java?", question.getQuestionTitle());
        assertEquals("Programming", question.getCategory());
        assertEquals("Easy", question.getDifficultylevel());  // Changed: getDifficultyLevel → getDifficultylevel
        assertEquals("A programming language", question.getRightAnswer());
    }

    @Test
    public void testQuestionNotNull() {
        Question question = new Question();
        assertNotNull(question);
    }

    @Test
    public void testQuestionIdSetter() {
        Question question = new Question();
        question.setId(100);

        assertEquals(100, question.getId());
    }

    @Test
    public void testQuestionTitleSetter() {
        Question question = new Question();
        question.setQuestionTitle("What is Spring Boot?");

        assertEquals("What is Spring Boot?", question.getQuestionTitle());
    }

    @Test
    public void testQuestionOptions() {
        Question question = new Question();
        question.setOption1("Option A");
        question.setOption2("Option B");
        question.setOption3("Option C");
        question.setOption4("Option D");

        assertEquals("Option A", question.getOption1());
        assertEquals("Option B", question.getOption2());
        assertEquals("Option C", question.getOption3());
        assertEquals("Option D", question.getOption4());
    }

    @Test
    public void testQuestionRightAnswer() {
        Question question = new Question();
        question.setRightAnswer("Option A");

        assertEquals("Option A", question.getRightAnswer());
    }
}