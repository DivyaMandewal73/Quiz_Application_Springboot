package com.SB.Quiz_Application.Dao;

import com.SB.Quiz_Application.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository <Quiz,Integer>{
}
