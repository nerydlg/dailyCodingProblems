package com.nerydlg.daily.coding.problems.hard;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntervalsTest {

    private Intervals subject = new Intervals();

    @Test
    void canflatAndMerge() {
        // [[[1,2],[5,6]], [[1,3]], [[4,10]]]
        List<List<Intervals.Interval>> schedule = new ArrayList<>();
        List<Intervals.Interval> e1 = new ArrayList<>();
        e1.add(new Intervals.Interval(1, 2));
        e1.add(new Intervals.Interval(5, 6));

        List<Intervals.Interval> e2 = new ArrayList<>();
        e2.add(new Intervals.Interval(1, 3));

        List<Intervals.Interval> e3 = new ArrayList<>();
        e3.add(new Intervals.Interval(4, 10));

        schedule.add(e1);
        schedule.add(e2);
        schedule.add(e3);

        List<Intervals.Interval> intervals = subject.mergeIntervals(schedule);
        assertEquals(2, intervals.size());

    }

}