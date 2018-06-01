package com.example.jml549.tetris;

public class Tetris {
    private int[][] board;
    private int height;
    private int width;
    private boolean running;
    private int score;
    private Tetrimino[] pieces;

    Tetris()
    {
        this.height = 12;
        this.width = 10;
        this.board = new int[height][width];
        this.running = true;
        this.score = 0;
        //this.pieces =
    }

    public int[][] getBoard()
    {
        return board;
    }

    public boolean getStatus()
    {
        return this.running;
    }

    public void updatePieces()
    {
        for (int piece = 0; piece < this.pieces.length; piece++)
        {

        }
    }

    public void addPieceToBoard(Tetrimino pieceToAdd)
    {
        CoordinateNode node = pieceToAdd.getSpaceOccupied().getFirst();

        while(node.getNext() != null)
        {
            this.board[node.getX()][node.getY()] = pieceToAdd.getType();
            node = node.getNext();
        }
    }


    public StringBuilder getBoardString()
    {
        StringBuilder rowString = new StringBuilder();
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                rowString.append(board[i][j]);
            }
            rowString.append("\n");
        }
        return rowString;
    }
}
