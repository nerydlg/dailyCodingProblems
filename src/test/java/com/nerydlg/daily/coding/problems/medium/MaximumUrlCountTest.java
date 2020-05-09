package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MaximumUrlCountTest {

    MaximumUrlCount subject = new MaximumUrlCount();

    @Test
    void canGetMaximumCommonUrlsBf() {
        String[] usr1 = new String[]{"/start", "/pink", "/register", "/orange","/red", "a"};
        String[] usr2 = new String[]{"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
        String[] expected = new String[]{"/pink", "/register", "/orange"};
        assertArrayEquals(expected, subject.getMaxmimumUrlCountBF(usr1, usr2));
    }

    @Test
    void canGetMaximumCommonUrlsBf2() {
        String[] usr1 = new String[]{"/start", "/pink", "/register", "/orange","/red", "a"};
        String[] usr2 = new String[]{"/pink", "/register", "/orange", "/one/two", "/start", "/green", "/blue" };
        String[] expected = new String[]{"/pink", "/register", "/orange"};
        assertArrayEquals(expected, subject.getMaxmimumUrlCountBF(usr1, usr2));
    }


    @Test
    void canGetMaximumCommonUrlsBf3() {
        String[] usr1 = new String[]{"/start", "/green", "/blue","/pink", "/register", "/orange", "/one/two", "/start", "/green", "/blue" };
        String[] usr2 = new String[]{"/pink", "/register", "/orange", "/one/two", "/start", "/green", "/blue" };
        String[] expected = new String[]{"/pink", "/register", "/orange", "/one/two", "/start", "/green", "/blue"};
        String[] result = subject.getMaxmimumUrlCountBF(usr1, usr2);
        assertArrayEquals(expected, result);
    }





}