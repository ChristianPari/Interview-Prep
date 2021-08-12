package com.christianpari;

import java.util.LinkedList;

public class TrainComposition {
  LinkedList<Integer> trains = new LinkedList<>();

  public void attachWagonFromLeft(int wagonId) {
    trains.addFirst(wagonId);
  }

  public void attachWagonFromRight(int wagonId) {
    trains.addLast(wagonId);
  }

  public int detachWagonFromLeft() {
    return trains.pollFirst() == null ? 0 : trains.pollFirst();
  }

  public int detachWagonFromRight() {
    return trains.pollLast() == null ? 0 : trains.pollLast();
  }

  public static void main(String[] args) {
    TrainComposition train = new TrainComposition();
    System.out.println(train.detachWagonFromRight()); // 7
    System.out.println(train.detachWagonFromLeft()); // 13
  }
}