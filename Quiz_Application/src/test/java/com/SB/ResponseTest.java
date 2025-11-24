package com.SB.Quiz_Application.Dao;

import com.SB.Quiz_Application.Model.Response;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResponseTest {

    @Test
    public void testResponseCreation() {
        Response response = new Response();
        response.setId(1);
        response.setReponse("Option A");  // Changed: setResponse → setReponse

        assertEquals(1, response.getId());
        assertEquals("Option A", response.getReponse());  // Changed: getResponse → getReponse
    }

    @Test
    public void testResponseNotNull() {
        Response response = new Response();
        assertNotNull(response);
    }

    @Test
    public void testResponseIdSetter() {
        Response response = new Response();
        response.setId(100);
        assertEquals(100, response.getId());
    }
}