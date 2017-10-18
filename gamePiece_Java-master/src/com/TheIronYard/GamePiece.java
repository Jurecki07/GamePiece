package com.TheIronYard;

public class GamePiece {
    int positionX = 0;
    int positionY = 0;
    boolean frozen = false;
    String name;
    String color;


    public int getPositionX() { return positionX; }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public GamePiece() { this.name = name; this.color = color;}


    void move(int positionX, int positionY){
//       if(positionX<= 0 && positionY>= 0) {
//            this.positionX = positionX;
//            this.positionY = positionY;
//
//       }else System.out.println("Invalid movement");
    }

    void freeze(){
        this.frozen = true;
    }

    void unfreeze(){
        this.frozen = false;
    }

}
