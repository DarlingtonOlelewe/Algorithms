package assement;


public class DoublyLinkedList {

    class Node{
        Node next;
        int value;
        Node prev;
    }

    public Node head;
    public Node tail;
    public void setHead(Node node) {
        // Write your code here.
        if (head == null) {
            head = tail = node;
            head.prev = null;
            tail.next = null;
        } else {
            Node newHead = head;
            int count = 0;
            while (newHead.next != null) {
                newHead = newHead.next;
                if (newHead == node) {
                    newHead.prev.next = newHead.next;
                    newHead.next.prev = newHead.prev;
                    head.prev = node;
                    node.next = head;
                    head = node;
                    head.prev = null;
                    count++;
                    break;
                }
            }
            if (count == 0) {
                head.prev = node;
                node.next = head;
                head = node;
                head.prev = null;
            }
        }
    }
    public void setTail(Node node) {
        // Write your code here.
        if (head == null) {
            head = tail = node;
            head.prev = null;
            tail.next = null;
        } else {
            Node newHead = head;
            int count = 0;
            while (newHead != null) {
                if (newHead == node) {
                    if (newHead.next == null) {
                        System.out.println(1);
                        tail.next = node;
                        node.prev = tail;
                        tail = node;
                        tail.next = null;
                        count++;
                    } else if (newHead.prev == null) {
                        head = newHead.next;
                        head.prev = null;
                        tail.next = node;
                        node.prev = tail;
                        tail = node;
                        tail.next = null;
                        count++;
                    }else {
                        newHead.prev.next = newHead.next;
                        newHead.next.prev = newHead.prev;
                        tail.next = node;
                        node.prev = tail;
                        tail = node;
                        tail.next = null;
                        count++;
                    }
                }
                newHead = newHead.next;
            }
            if (count == 0) {
                tail.next = node;
                node.prev = tail;
                tail = node;
                tail.next = null;
            }
        }
    }
    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
        Node current = head;
        while (current != null) {
            if (current == nodeToInsert) {
                if (nodeToInsert.prev == null) {
                    head = nodeToInsert.next;
                    head.prev = null;
                } else if (nodeToInsert.next == null) {
                    tail = nodeToInsert.prev;
                    tail.next = null;
                } else {
                    nodeToInsert.prev.next = nodeToInsert.next;
                    nodeToInsert.next.prev = nodeToInsert.prev;
                }
            }
            current = current.next;
        }
        if (node.prev == null) {
            node.prev = nodeToInsert;
            nodeToInsert.next = node;
            head = nodeToInsert;
            head.prev = null;
        } else {
            node.prev.next = nodeToInsert;
            nodeToInsert.prev = node.prev;
            node.prev = nodeToInsert;
            nodeToInsert.next = node;
        }
    }
    public void insertAfter(Node node, Node nodeToInsert) {
        // Write your code here.
        Node current = head;
        while (current != null) {
            if (current == nodeToInsert) {
                if (nodeToInsert.prev == null) {
                    head = nodeToInsert.next;
                    head.prev = null;
                } else if (nodeToInsert.next == null) {
                    tail = nodeToInsert.prev;
                    tail.next = null;
                } else {
                    nodeToInsert.prev.next = nodeToInsert.next;
                    nodeToInsert.next.prev = nodeToInsert.prev;
                }
            }
            current = current.next;
        }
        if (node.next == null) {
            node.next = nodeToInsert;
            nodeToInsert.prev = node;
            tail = nodeToInsert;
            tail.next = null;
        } else {
            node.next.prev = nodeToInsert;
            nodeToInsert.next = node.next;
            node.next = nodeToInsert;
            nodeToInsert.prev = node;
        }
    }
    public void insertAtPosition(int position, Node nodeToInsert) {
        // Write your code here.
        int count = 1;
        Node current = head;
        while (count < position && current.next != null) {
            current = current.next;
            count++;
        }
        if (current.prev == null) {
            current.prev = nodeToInsert;
            nodeToInsert.next = current;
            head = nodeToInsert;
            head.prev = null;
        } else if (current.next == null) {
            current.next = nodeToInsert;
            nodeToInsert.prev = current;
            tail = nodeToInsert;
            tail.next = null;
        } else {
            current.prev.next = nodeToInsert;
            nodeToInsert.prev = current.prev;
            current.prev = nodeToInsert;
            nodeToInsert.next = current;
        }
    }
    public void removeNodesWithValue(int value) {
        // Write your code here.
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                System.out.println("I'm here");
                if (current.prev == null) {
                    System.out.println(1);
                    head = head.next;
                    head.prev = null;
                } else if (current.next == null) {
                    System.out.println(2);
                    tail = current.prev;
                    current.prev.next = null;
                } else {
                    System.out.println(3);
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }
    }
    public void remove(Node node) {
        // Write your code here.
        Node current = head;
        while (current != null) {
            if (current == node) {
                if (current.next == null) {
                    tail = current.prev;
                    current.prev.next = null;
                } else if (current.prev == null) {
                    head = current.next;
                    head.prev = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }
    }
    public boolean containsNodeWithValue(int value) {
        // Write your code here.
        if (head == null) return false;
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void printNodes() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}