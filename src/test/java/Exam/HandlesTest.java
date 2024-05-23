package Exam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HandlesTest {
    Handles h1;

    @BeforeEach
    void setUP(){
        //given
     h1 = new Handles();
     h1.addHandle("Julian", "@jubilee");
     h1.addHandle("Gary", "@snailMail");

    }
    @Test
    void CheckHandle(){
        //when
        boolean actual = h1.checkHandle("@jubilee");

        //then
        Assertions.assertEquals(true, actual);

    }
    @Test
    void testRemove(){
        //when
       h1.remove("@jubilee");

        //then
        Assertions.assertTrue(h1.getMapOfHandles().containsValue("@jubilee"));
    }
    @Test
    void testChangehandle () {
        h1.changeHandle("Julian","@jubilee","@j-money");

        //then
        Assertions.assertEquals("@j-money",h1.getMapOfHandles().get("Julian"));
    }

//    @Test
//    void displayName(){
//        //when
//        expectedOutput = displayName();
//        //then
//        Assertions.assertEquals();
//
//    }



}