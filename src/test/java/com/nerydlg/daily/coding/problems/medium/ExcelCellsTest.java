package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelCellsTest {

    private ExcelCells subject;

    @Test
    void canSetValue() {
        subject = new ExcelCells();
        subject.set("A", 10);
        subject.set("B", 10);
        subject.set("C", 10);
        subject.set("D", 10);

        assertEquals(subject.size(), 4);

    }

    @Test
    void canGetValue() {
        subject = new ExcelCells();
        subject.set("A", 10);
        subject.set("B", 20);
        subject.set("C", 30);
        subject.set("D", 40);

        subject.set("E1", "A+B");
        subject.set("E2", "B*C");
        subject.set("E3", "C-B");
        subject.set("E4", "D/A");

        assertEquals(subject.get("E1"), 30);
        assertEquals(subject.get("E2"), 600);
        assertEquals(subject.get("E3"), 10);
        assertEquals(subject.get("E4"), 4);


        subject.set("E5", "E2/E1");

        assertEquals(subject.get("E5"), 20);
        subject.set("E1", 10);
        assertEquals(subject.get("E5"), 60);
    }
}