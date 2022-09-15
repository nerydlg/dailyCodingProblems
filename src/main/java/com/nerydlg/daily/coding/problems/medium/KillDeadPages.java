package com.nerydlg.daily.coding.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class KillDeadPages {

  /**
   * alive = [
   * 0 => false,
   * 1 => true,
   * 2 => false,
   * 3 => true,
   * 4 => false
   * ];
   * links = [
   * 0 => [ 1, 2, 3 ],
   * 1 => [ 3 ],
   * 2 => [ 4 ],
   * 3 => [ 1 ],
   * 4 => [], // irrelevant since alive[4] = false;
   * ]
   *
   * @param status
   * @param linkPages
   * @return
   */
  private Map<Integer, Boolean> alive;
  private Map<Integer, List<Integer>> links;
  private Set<Integer> visited;
  public Map<Integer, Boolean> killDeadPages(Map<Integer, Boolean> alive, Map<Integer, List<Integer>> links) {

    this.alive = alive;
    this.links = links;
    this.visited = new HashSet<>();
    //if(!dfs(0)) {
    dfs(0);
      //this.alive.put(0, false);
    //}

    return this.alive;
  }

  private boolean dfs(int currentElement) {
    List<Integer> childs = links.get(currentElement);
    if(!alive.get(currentElement)) {
      return false;
    }
    for(Integer curr: childs) {
      if(!visited.contains(curr)) {
        visited.add(curr);
        if(!dfs(curr)) {
          alive.put(currentElement, false);
          return false;
        }
      }
    }
    return true;
  }
}
