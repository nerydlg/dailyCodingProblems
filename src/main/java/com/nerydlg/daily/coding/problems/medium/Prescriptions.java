package com.nerydlg.daily.coding.problems.medium;
import java.util.Arrays;
import java.util.List;

//
// Given a list of prescription medications and start and end dates for each
// write a program that determines the maximum number of prescriptions that a person
// has had active at any point in time
//
//  [(A, 1, 5), (B, 2, 4), (C, 6, 8), (D, 4, 6)]
//
//answer: 3
public class Prescriptions {

  public static class Medications {
    String drug;
    int startDate;
    int endDate;

    public Medications(String drug, int startDate, int endDate) {
      this.drug = drug;
      this.startDate = startDate;
      this.endDate = endDate;
    }
  }

  private int[] days;

  public int finMaxMedicationsAtAnyPoint(List<Medications> medicationsList) {
    // find start day
    int latestDay = findLatestDay(medicationsList);
        // create an array of size end date
    days = new int[latestDay];
    // by default array is initialized as 0
    medicationsList.stream()
        .forEach(this::union);

    // return the maximum
    return Arrays.stream(days)
               .max()
               .getAsInt();
  }

  private void union(Medications medications) {
    for(int i = medications.startDate - 1; i < medications.endDate; i++) {
      days[i]++;
    }
  }


  private int findLatestDay(List<Medications> medicationsList) {
    return medicationsList.stream()
               .map(medication -> medication.endDate)
               .reduce(Integer.MIN_VALUE, (max, curr) -> max < curr ? curr : max);
  }

  private int findFirstDay(List<Medications> medicationsList) {
    return medicationsList.stream()
        .map(medication -> medication.startDate)
        .reduce(Integer.MAX_VALUE, (min, curr) -> min > curr ? curr : min);
  }
}
