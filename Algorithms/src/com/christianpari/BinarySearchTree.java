package com.christianpari;

public class BinarySearchTree {
  public static void main(String[] args) {
    Node n1 = new Node(1, null, null);
    Node n3 = new Node(3, null, null);
    Node n2 = new Node(2, n1, n3);

    System.out.println(contains(n2, 3));
  }

  public static boolean contains(Node root, int value) {
    boolean found = false;
    if (value == root.value)
      found = true;
    else if (value < root.value && root.left != null)
      return contains(root.left, value);
    else if (value > root.value && root.right != null)
      return contains(root.right, value);
    return found;
  }
}

class Node {
  public int value;
  public Node left, right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}