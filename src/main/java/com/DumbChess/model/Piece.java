package com.DumbChess.model;

public class Piece {
    private PieceType type;
    private String color;

    public Piece(PieceType type, String color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
