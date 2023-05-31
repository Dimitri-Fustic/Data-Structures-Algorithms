package me.dimitri.algorithms.linked_lists;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList);
    }

}
