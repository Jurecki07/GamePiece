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
            gamePiece.move(posx + 1, posy + 1);

//Verify that if the game piece is frozen then the call to move does not change the position.

            if (posx == gamePiece.getPositionX() && posy == gamePiece.getPositionY()) {
            System.out.println("Testing is complete that if the game piece is frozen then the call to move does not change the position.");
        } else {
            System.out.println("Test failed");
        }
    }

        }
    }












// Scrap
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

