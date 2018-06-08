package com.example.jml549.tetris;

public class Tetrimino {

    /*
     * 1 - box
     * 2 - 'T'
     * 3 - 'L'
     * 4 - reflected 'L'
     * 5 - 'S'
     * 6 - reflected 'S'
     * 7 - '|'
     * */
    private int type;
    /*
     * 1 - horizontal
     * 2 - vertical
     * 3 - left
     * 4 - right
     * */
    private int orientation;
    private CoordinateLinkedList spaceOccupied;
    boolean set; //flag to show when the piece is done moving

    Tetrimino(int type)
    {
        this.type = type;
        CoordinateNode newNode = new CoordinateNode(type, 0, 4);
        this.spaceOccupied = new CoordinateLinkedList(newNode);
        newPieceSetup(newNode);
        this.orientation = 1;
    }

    public void newPieceSetup(CoordinateNode first)
    {
        this.spaceOccupied = new CoordinateLinkedList(first);
        switch (this.type)
        {
            case 1:
                this.spaceOccupied.addCoordinate(first, first.getType(), first.getX(), first.getY()+1);
                this.spaceOccupied.addCoordinate(first, first.getType(), first.getX()+1, first.getY());
                this.spaceOccupied.addCoordinate(first, first.getType(), first.getX()+1, first.getY()+1);
                break;

            default: break;
        }
    }

    public int getType()
    {
        return this.type;
    }

    public CoordinateLinkedList getSpaceOccupied()
    {
        return this.spaceOccupied;
    }

    public void printCoordinateList()
    {
        CoordinateNode node = this.spaceOccupied.getFirst();

        while(node.getNext() != null)
        {
            System.out.println("X: " + node.getX() + " Y: " + node.getY());
            node = node.getNext();
        }

    }
}
