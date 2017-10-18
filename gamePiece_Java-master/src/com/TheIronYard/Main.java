package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();

        if (!gamePiece.isFrozen()) {
            gamePiece.freeze();
            if (gamePiece.isFrozen()) {
                System.out.println("The freeze() method works correctly");
            } else {
                System.out.println("The freeze method did not work");
            }
        }
        if (gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            if (gamePiece.isFrozen()) {
                System.out.println("The unfreeze method worked");
            } else {
                System.out.println("The unfreeze method worked");

            }
        }
        gamePiece.freeze();
        if (!gamePiece.isFrozen()) {
            int posx = gamePiece.getPositionX();
            int posy = gamePiece.getPositionY();
// Call the move () method thats a diffrent then before then call the move
        }
    }
}










//                System.out.println("positionX before moving: " + gamePiece.getPositionX());
//                System.out.println("positionY before moving: " + gamePiece.getPositionY());
//
//                gamePiece.move(0, 0);
//                {
//                    System.out.println("positionX after moving: " + gamePiece.getPositionX());
//                    System.out.println("positionY after moving: " + gamePiece.getPositionY());
//                }
//            }
//
//            if (gamePiece.isFrozen()) {
//                System.out.println(gamePiece.move(0, 0, ) + " is frozen and can't move");
//            }
//
//        }
//    }



// Line 40 has issues with the logic as you are returning void.

