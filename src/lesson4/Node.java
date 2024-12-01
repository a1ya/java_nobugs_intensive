package lesson4;

import java.util.HashSet;

public class Node {

    String data;
    Node next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void printInfo() {
        System.out.print("Current node value: " + data + ". ");
        if (next == null) {
            System.out.println("No next node");
        } else {
            System.out.println("Next node value: " + next.data);
        }
    }

    public static void revertNodeListByHeadNode(Node node) {
        Node tmpNodePrev = new Node(null, null); // to store previous node

        while (node != null) {
            node.printInfo();
            Node tmpNodeNext = node.getNext();  // to store next node
            node.setNext(tmpNodePrev); // updating next
            tmpNodePrev = node; // saving prev
            node = tmpNodeNext; // moving to next node
        }
    }

    public static void revertNodeListByHeadNodeExtra(Node node) { // if there is no last node with null in next
        Node tmpNodePrev = new Node(null, null); // to store previous node
        HashSet<Node> hashSetOfNodes = new HashSet<>();

        while (node != null) {
            if (hashSetOfNodes.contains(node)) {
                System.out.println("Attention! This node " + node.data + " was already changed. Stopping process.");
                break;
            }
            hashSetOfNodes.add(node);
            System.out.println("hashSetOfNodes: " + hashSetOfNodes);
            Node tmpNodeNext = node.getNext();
            node.setNext(tmpNodePrev);
            tmpNodePrev = node;
            node = tmpNodeNext;

        }
    }



}
