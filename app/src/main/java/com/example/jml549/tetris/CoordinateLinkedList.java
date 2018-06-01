package com.example.jml549.tetris;

public class CoordinateLinkedList {

    private CoordinateLinkedList nextNode;
    private int x;
    private int y;

    public CoordinateLinkedList(int firstX, int firstY)
    {
        this.x = firstX;
        this.y = firstY;
        CoordinateLinkedList first = new CoordinateLinkedList(x, y);
    }

    public void addCoordinate(CoordinateLinkedList first, int x, int y)
    {
        CoordinateLinkedList node = first;
        CoordinateLinkedList newNode = new CoordinateLinkedList(x, y);

        while(node.nextNode != null)
        {
            node.nextNode = node.nextNode.nextNode;
        }

        node.nextNode = newNode;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }
}
