package com.example.jml549.tetris;

public class CoordinateNode {

    int type;
    int x;
    int y;
    CoordinateNode next;

    public CoordinateNode(int type, int x, int y)
    {
        this.type = type;
        this.x = x;
        this.y = y;
        next = null;
    }

    public int getType()
    {
        return this.type;
    }

    public CoordinateNode getNext()
    {
        return next;
    }

    public void setNext(CoordinateNode next) {
        this.next = next;
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
