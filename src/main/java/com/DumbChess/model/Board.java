package com.DumbChess.model;

public class Board {
    private Piece[][] pieces;

    public Board() {
        pieces = new Piece[8][8];
        initializeBoard();
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            pieces[1][i] = new Piece(PieceType.PAWN, "WHITE");
            pieces[6][i] = new Piece(PieceType.PAWN, "BLACK");
        }
        pieces[0][0] = new Piece(PieceType.ROOK, "WHITE");
        pieces[0][7] = new Piece(PieceType.ROOK, "WHITE");
        pieces[7][0] = new Piece(PieceType.ROOK, "BLACK");
        pieces[7][7] = new Piece(PieceType.ROOK, "BLACK");

        pieces[0][1] = new Piece(PieceType.KNIGHT, "WHITE");
        pieces[0][6] = new Piece(PieceType.KNIGHT, "WHITE");
        pieces[7][1] = new Piece(PieceType.KNIGHT, "BLACK");
        pieces[7][6] = new Piece(PieceType.KNIGHT, "BLACK");

        pieces[0][2] = new Piece(PieceType.BISHOP, "WHITE");
        pieces[0][5] = new Piece(PieceType.BISHOP, "WHITE");
        pieces[7][2] = new Piece(PieceType.BISHOP, "BLACK");
        pieces[7][5] = new Piece(PieceType.BISHOP, "BLACK");

        pieces[0][3] = new Piece(PieceType.QUEEN, "WHITE");
        pieces[0][4] = new Piece(PieceType.KING, "WHITE");

        pieces[7][3] = new Piece(PieceType.QUEEN, "BLACK");
        pieces[7][4] = new Piece(PieceType.KING, "BLACK");
    }
}
