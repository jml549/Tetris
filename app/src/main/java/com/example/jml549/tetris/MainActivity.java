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
        tetris = new Tetris();
        TextView board = findViewById(R.id.board);
        board.setText(tetris.getBoardString());
    }

    public void update(View view)
    {
        int[][] board = tetris.getBoard();

        TextView boardString = findViewById(R.id.board);
        boardString.setText(tetris.getBoardString());
    }

    public void addPiece(View view)
    {
        int[] spawnLocation = {0,4};
        Tetrimino tetrimino = new Tetrimino(1, spawnLocation);

        TextView board = findViewById(R.id.board);
        tetrimino.setSpaceOccupied(tetris.getBoard());
        board.setText(tetris.getBoardString());
    }
}
