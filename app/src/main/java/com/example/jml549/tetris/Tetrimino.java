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
    private int[] location;
    boolean set; //flag to show when the piece is done moving

    Tetrimino(int type, int[] location)
    {
        this.type = type;
        this.location = location;
        this.orientation = 1;

    }

    public int[][] setSpaceOccupied(int[][] board)
    {
        switch (this.type)
        {
            case 1: board[this.location[0]][this.location[1]] = 1;
                    board[this.location[0]+1][this.location[1]] = 1;
                    board[this.location[0]][this.location[1]+1] = 1;
                    board[this.location[0]+1][this.location[1]+1] = 1;
                    return board;

            default: return board;
        }

    }

    private int getType()
    {
        return this.type;
    }

    private int[] getLocation()
    {
        return this.location;
    }
}
