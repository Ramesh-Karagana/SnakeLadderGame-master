package com.example.snakeladdergame;

import javafx.util.Pair;

import java.util.ArrayList;

public class Board {
    ArrayList<Pair<Integer,Integer>> positionCoordinates;
    ArrayList<Integer> snakeLadderPosition;
    public Board()
    {
        positionCoordinates=new ArrayList<>();
        populatePositionCoordinates();
        populateSnakeLadder();
    }
    private void populatePositionCoordinates()
    {
        positionCoordinates.add(new Pair<>(0,0));
        for(int i=0;i<SnakeLadder.height;i++)
        {
            for(int j=0;j<SnakeLadder.height;j++)
            {
                int xCord=0;
                if(i%2==0)
                {
                    xCord=j*SnakeLadder.tileSize+SnakeLadder.tileSize/2;
                }
                else
                {
                    xCord=SnakeLadder.tileSize*SnakeLadder.height-(j*SnakeLadder.tileSize)-SnakeLadder.tileSize/2;
                }
                int yCord=SnakeLadder.tileSize*SnakeLadder.height-(i*SnakeLadder.tileSize)-SnakeLadder.tileSize/2;
                positionCoordinates.add(new Pair<>(xCord,yCord));
            }
        }
    }

    private void populateSnakeLadder()
    {
        snakeLadderPosition = new ArrayList<>();
        for(int i=0;i<101;i++)
        {
            snakeLadderPosition.add(i);
        }

        snakeLadderPosition.set(4,14);
        snakeLadderPosition.set(9,31);
        snakeLadderPosition.set(17,7);
        snakeLadderPosition.set(21,42);
        snakeLadderPosition.set(28,84);
        snakeLadderPosition.set(62,19);
        snakeLadderPosition.set(54,34);
        snakeLadderPosition.set(87,36);
        snakeLadderPosition.set(64,60);
        snakeLadderPosition.set(51,67);
        snakeLadderPosition.set(80,99);
        snakeLadderPosition.set(98,79);
        snakeLadderPosition.set(94,75);
        snakeLadderPosition.set(93,73);
        //snakeLadderPosition.set(1,38);
    }

    public int getNewPosition(int currentPosition)
    {
        if(currentPosition>0 && currentPosition<=100)
        {
            return snakeLadderPosition.get(currentPosition);
        }
        return -1;
    }

    int getXCoordinate(int position)
    {
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getKey();
        return -1;
    }

    int getYCoordinate(int position)
    {
        if(position>=1 && position<=100)
            return positionCoordinates.get(position).getValue();
        return -1;
    }

    /*public static void main(String[] args)
    {
        Board board= new Board();
        for(int i=0;i< board.positionCoordinates.size();i++)
        {
            System.out.println(i+"$ X:"+board.positionCoordinates.get(i).getKey()+" Y:"+board.positionCoordinates.get(i).getValue());
        }
    }*/
}
