package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();

        if (!gamePiece.isFrozen()) {
            gamePiece.freeze();
            if (gamePiece.frozen) {
                System.out.println("The game piece is frozen");
            } else {
                System.out.println("The Game Piece is not frozen");
            }
        }
        if (gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            if (gamePiece.frozen) {
                System.out.println("The game piece is not frozen");
            } else {
                System.out.println("This game piece is frozen");

//            }
//            System.out.println("The game piece is frozen");
            }

            if (!gamePiece.isFrozen()) {
                System.out.println("positionX before moving: " + gamePiece.getPositionX());
                System.out.println("positionY before moving: " + gamePiece.getPositionY());

                gamePiece.move(0, 0);
                {
                    System.out.println("positionX after moving: " + gamePiece.getPositionX());
                    System.out.println("positionY after moving: " + gamePiece.getPositionY());
                }
            }

            if (gamePiece.isFrozen()) {
                System.out.println(gamePiece.move(0, 0, ) + " is frozen and can't move");
            }

        }
    }

}

