package data_structure;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;
  public ListQueue(){
    front = rear = null;
    size = 0;
  }
  boolean isEmpty() {
    return (size == 0) ? true : false;
  }
  int size() {
    return size;
  }

  // poll 과 offer 를 구현하되 sLinkedList 의 코드를 활용해보라.

  void offer(E item){ // 추가
    // offer 를 구현하되 sLinkedList 의 코드를 활용해보라.
    Node<E> newNode = new Node<>(item, front);
    if (size == 0) {
      rear = newNode;
    }
    front = newNode;
    size++;
  }

  Node<E> getNode(int index){
    Node<E> find = front;
    for (int i = 0; i < index; i++) {
      find = find.next;
    }
    return find;
  }

  E poll() { // 제거
    // poll 을 구현하되 sLinkedList 의 코드를 활용해보라.
    Node<E> removedNode = front;
    front = front.next;
    removedNode.next = null;
    if (size == 1) {
      front = rear = null;
    }
    size--;
    return removedNode.item;
  }

  private class Node<E> {
    E item;
    Node<E> next;
    public Node(E newItem, Node<E> node) {
      this.item = newItem;
      next = node;
    }
  }

  @Override
  public String toString() {
    return "ListQueue{" +
        "front=" + front +
        ", rear=" + rear +
        ", size=" + size +
        '}';
  }
}