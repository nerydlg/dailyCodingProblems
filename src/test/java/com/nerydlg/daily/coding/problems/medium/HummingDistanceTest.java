package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HummingDistanceTest {

    HummingDistance subject;

    @Test
    public void WhenGivenAnArrayOf3_ThenItShouldWork () {
        // GIVEN
        int expectedValue = 4;
        subject = new HummingDistance();
        int[] nums1 = {1,2,3};
        // WHEN
        int actual = subject.GetSumOfDistances(nums1);
        // THEN
        assertEquals(expectedValue, actual);
    }

}