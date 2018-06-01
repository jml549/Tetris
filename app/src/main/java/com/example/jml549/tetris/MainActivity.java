package com.example.jml549.tetris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Tetris tetris;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tetris = new Tetris();
        TextView board = findViewById(R.id.board);
        board.setText(tetris.getBoardString());
    }

    public void startGame(View view)
    {
        int[][] board = tetris.getBoard();

        while (this.tetris.getStatus())
        {

        }
    }

    public void update(View view)
    {
        int[][] board = tetris.getBoard();

        TextView boardString = findViewById(R.id.board);
        boardString.setText(tetris.getBoardString());
    }

    public void addPiece(View view)
    {
        Tetrimino tetrimino = new Tetrimino(1);
        tetrimino.printCoordinateList();
        tetris.addPieceToBoard(tetrimino);

        TextView board = findViewById(R.id.board);
        board.setText(tetris.getBoardString());
    }
}
