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
        this.spaceOccupied = newPieceSetup();
        this.orientation = 1;

    }

    public CoordinateLinkedList newPieceSetup()
    {
        switch (this.type)
        {
            case 1: break;

            default: break;
        }
    }

    private int getType()
    {
        return this.type;
    }

    private CoordinateLinkedList getSpaceOccupied()
    {
        return this.spaceOccupied;
    }
}
