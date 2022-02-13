package com.nerydlg.daily.coding.problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrescriptionsTest {


  Prescriptions subject = new Prescriptions();

  @Test
  void canFindMaximumFromFourDates() {
    // GIVEN
    List<Prescriptions.Medications> medicationsList = List.of(
        new Prescriptions.Medications("A", 1, 5),
        new Prescriptions.Medications("B", 2, 4),
        new Prescriptions.Medications("C", 6, 8),
        new Prescriptions.Medications("D", 4, 6)
    );
    int expected = 3;
    // WHEN
    int actual = subject.finMaxMedicationsAtAnyPoint(medicationsList);
    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void canFindMaximumFromThreeDates() {
    // GIVEN
    List<Prescriptions.Medications> medicationsList = List.of(
        new Prescriptions.Medications("A", 1, 5),
        new Prescriptions.Medications("B", 2, 4),
        new Prescriptions.Medications("C", 6, 8)
    );
    int expected = 2;
    // WHEN
    int actual = subject.finMaxMedicationsAtAnyPoint(medicationsList);
    // THEN
    assertEquals(expected, actual);
  }

  @Test
  void canFindMaximumFromSixDates() {
    // GIVEN
    List<Prescriptions.Medications> medicationsList = List.of(
        new Prescriptions.Medications("A", 1, 7),
        new Prescriptions.Medications("B", 2, 6),
        new Prescriptions.Medications("C", 6, 8),
        new Prescriptions.Medications("D", 4, 6),
        new Prescriptions.Medications("E", 3, 6),
        new Prescriptions.Medications("F", 4, 6)
    );
    int expected = 6;
    // WHEN
    int actual = subject.finMaxMedicationsAtAnyPoint(medicationsList);
    // THEN
    assertEquals(expected, actual);
  }
}