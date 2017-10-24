package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();

        if (!gamePiece.isFrozen()) {
            gamePiece.freeze();
            if (gamePiece.isFrozen()) {
                System.out.println("The freeze() method works correctly frozen is true");
            } else {
                System.out.println("The freeze method did not work");
            }
        }
        if (gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            if (gamePiece.isFrozen()) {
                System.out.println("The unfreeze method worked Frozen is false");
            } else {
                System.out.println("The unfreeze did not work");

            }
        }
//        gamePiece.freeze();
        if (gamePiece.isFrozen()) {
            int posx = gamePiece.getPositionX();
            int posy = gamePiece.getPositionY();
            gamePiece.move(posx + 1, posy + 1);
            if (posx == gamePiece.getPositionX() && posy == gamePiece.getPositionY()) {
                System.out.println("Testing move method does NOT change when frozen");
            } else {
                System.out.println("Test failed");
            }
        }
        gamePiece.freeze();
        if (!gamePiece.isFrozen()) {
            int posx = gamePiece.getPositionX();
            int posy = gamePiece.getPositionY();
            gamePiece.move(posx + 2, posy + 2);
            if (posx != gamePiece.getPositionX() && posy != gamePiece.getPositionY()) {
                System.out.println("Testing move method DOES change when frozen");
            } else {
                System.out.println("Test Failed");
            }
        }
    }
}



