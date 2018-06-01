package com.example.jml549.tetris;

public class CoordinateLinkedList {

    CoordinateNode first;
    int nodeCount;

    public CoordinateLinkedList(CoordinateNode first)
    {
        this.first = first;
        this.nodeCount = 1;
    }

    public void addCoordinate(CoordinateNode first, int type, int x, int y)
    {
        CoordinateNode node = first;
        CoordinateNode newNode = new CoordinateNode(type, x, y);

        while(node.getNext() != null)
        {
            node = node.getNext();
        }

        node.setNext(newNode);
        this.nodeCount++;
    }

    public CoordinateNode getFirst() {
        return first;
    }
}
