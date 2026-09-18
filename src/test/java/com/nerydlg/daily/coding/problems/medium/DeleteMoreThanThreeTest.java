package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMoreThanThreeTest {
    DeleteMoreThanThree subject;

    @Test
    void canDeleteMoreThanThree(){
        // GIVEN
        subject = new DeleteMoreThanThree();
        String test = "aaa";
        String expected = "";
        // WHEN
        String actual = subject.DeleteMoreThanThree(test);
        // THEN
        assertEquals(expected, actual);
    }
}