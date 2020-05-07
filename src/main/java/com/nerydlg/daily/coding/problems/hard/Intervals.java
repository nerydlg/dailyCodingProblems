package com.nerydlg.daily.coding.problems.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Intervals {

    static class Interval {
        public int start;
        public int end;

        public Interval() {
        }

        public Interval(int _start, int _end) {
            start = _start;
            end = _end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> mergedIntervals = mergeIntervals(schedule);
        return getFreeTime(mergedIntervals);
    }

    private List<Interval> getFreeTime(List<Interval> mergedIntervals) {
        List<Interval> result = new ArrayList<>();
        int prev = 0;
        for(int i = 1; i < mergedIntervals.size(); i++) {
            result.add(new Interval(mergedIntervals.get(prev).end, mergedIntervals.get(i).start));
            prev++;
        }
        return result;
    }

    public List<Interval> mergeIntervals (List < List < Interval >> schedule) {
        List<Interval> flattenedList = new ArrayList<>();
        // flat
        for (List<Interval> employee : schedule) {
            for (Interval time : employee) {
                flattenedList.add(time);
            }
        }

        flattenedList.stream().forEach(System.out::println);

        flattenedList = flattenedList.stream()
                .sorted((a, b) -> a.start != b.start ? a.start - b.start : a.end - b.end)
                .collect(Collectors.toList());

        List<Interval> flattenedMerged = new ArrayList<>();
        Interval prev = flattenedList.get(0);
        for (int i = 0; i < flattenedList.size(); i++) {
            Interval curr = flattenedList.get(i);
            if(curr.start > prev.end) {
                flattenedMerged.add(prev);
                prev = curr;
            } else {
                prev = merge(prev, curr);
            }
        }
        flattenedMerged.add(prev);
        return flattenedMerged;
    }

    private Interval merge(Interval curr, Interval next) {
        return new Interval(curr.start, Math.max(next.end, curr.end));
    }
}
