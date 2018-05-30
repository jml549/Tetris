package com.example.jml549.tetris;

public class Tetris {
    private int[][] board;
    private int height;
    private int width;
    private boolean running;
    private int score;

    Tetris()
    {
        height = 12;
        width = 10;
        board = new int[height][width];
        running = true;
        score = 0;
    }

    public int[][] getBoard()
    {
        return board;
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
