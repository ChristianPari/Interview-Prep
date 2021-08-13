package com.christianpari;

import java.util.regex.Pattern;

public class UserInput {
  public static class TextInput {
    private String value = "";

    public void add(char c) {
      value += c;
    }

    public String getValue() { return value; }
  }

  public static class NumericInput extends TextInput {
    @Override
    public void add (char c) {
      if (Pattern.matches("[0-9]", Character.toString(c)))
        super.add(c);
    }
  }

  public static void main(String[] args) {
    //TextInput input = new NumericInput();
    //input.add('1');
    //input.add('a');
    //input.add('0');
    //System.out.println(input.getValue());
  }
}
