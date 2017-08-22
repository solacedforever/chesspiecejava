package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GamePiece gamePiece = new GamePiece("knight", "black");

        gamePiece.freeze();
        gamePiece.moveIfPossible(20,10);
        gamePiece.describePiece();



    }

}
