public class LinkedList {
  Node head;

  static class Node {
    int val;
    Node next;

    Node(int v) {
      val = v;
      next = null;
    }
  }

  void print(){
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.val + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  void insertAtFirst(int val){
    Node new_node = new Node(val);

    if(head == null) {
      head = new_node;
      return;
    }
    new_node.next = head;
    head = new_node;
  }

  void insertAtLast(int val){
    Node new_node = new Node(val);
    if(head == null) {
       head = new_node;
       return;
    }
    Node curr = head;
    while(curr.next != null){
      curr = curr.next;
    }

    curr.next = new_node;
  }

  void deleteAtFirst(){
    if(head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

    head = head.next;
  }

  void deleteAtLast(){
    if (head == null) {
      System.out.println("LinkedList is Already Empty !!");
      return;
    }

    // Handle single node case
    if (head.next == null) {
      head = null;
      return;
    }

    Node curr = head;
    while(curr.next.next != null){
      curr = curr.next;
    }

    curr.next = null;
  }

  void printSum() {
    int sum = 0;
    Node curr = head;

    while (curr != null) {
      sum += curr.val;
      curr = curr.next;
    }

    System.out.println("Sum of elements: " + sum);
  }
  void printMax() {
  if (head == null) {
    System.out.println("LinkedList is Empty !!");
    return;
  }

  int max = head.val;
  Node curr = head.next;

  while (curr != null) {
    if (curr.val > max) {
      max = curr.val;
    }
    curr = curr.next;
  }

  System.out.println("Greatest element: " + max);
}

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertAtFirst(10);
    ll.insertAtFirst(20);
    ll.insertAtFirst(30);
    ll.deleteAtFirst();
    ll.insertAtLast(44);
    ll.insertAtLast(55);
    ll.deleteAtLast();

    ll.print();
    ll.printSum();  
    ll.printMax();
  }
}
