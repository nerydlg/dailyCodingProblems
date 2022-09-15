package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class KillDeadPagesTest {

  private KillDeadPages subject;

  @Test
  void canKillAllPagesRelatedToADeadPage() {
    // GIVEN
    subject = new KillDeadPages();
    Map<Integer, Boolean> alive = new HashMap<>();
    alive.put(0, true);
    alive.put(1, true);
    alive.put(2, true);
    alive.put(3, true);
    alive.put(4, false);
    Map<Integer, List<Integer>> links = new HashMap<>();
    links.put(0, List.of(1, 2, 3));
    links.put(1, List.of(3));
    links.put(2, List.of(4));
    links.put(3, List.of(1));
    links.put(4, List.of());
    // WHEN
    Map<Integer, Boolean> actual = subject.killDeadPages(alive, links);

    // THEN
    actual.entrySet()
        .stream()
        .map(entry -> entry.getKey() + "=>" + entry.getValue())
        .forEach(System.out::println);
  }
}