package com.christianpari;

import java.util.HashSet;

public class Song {
  public static void main(String[] args) {
    Song first = new Song("Hello");
    Song second = new Song("Eye of the tiger");

    first.setNextSong(second);
    second.setNextSong(first);

    System.out.println(first.isRepeatingPlaylist());
  }

  private String name;
  private Song nextSong;

  public Song(String name) {
    this.name = name;
  }

  public void setNextSong(Song nextSong) {
    this.nextSong = nextSong;
  }

  public boolean isRepeatingPlaylist() {
    HashSet<String> names = new HashSet<>();
    Song next = nextSong;
    while (next != null) {
      if (names.contains(next.name))
        return true;
      names.add(next.name);
      next = next.nextSong;
    }
    return false;
  }
}
