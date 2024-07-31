// src/main/java/com/dumbchess/service/ChessService.java
package com.DumbChess.service;

import com.DumbChess.model.*;

public class ChessService {
    public Board initializeBoard() {
        // Initialize board with default pieces

        Board board = new Board();

        return board;
    }

    public boolean validateMove(Move move) {
        // Validate move according to rules
        Piece piece = board.getPieces()[move.getStartX()][move.getStartY()];

        if (piece == null) {
            return false;
        }
        switch (piece.getType()) {
            case PAWN:
                return validatePawnMove(move, piece);
                break;
            case KNIGHT:
                return validateKnightMove(move, piece);
                break;
            case BISHOP:
                return validateBishopMove(move, piece);
                break;
            case ROOK:
                return validateRookMove(move, piece);
                break;
            case QUEEN:
                return validateQueenMove(move, piece);
                break;
            case KING:
                return validateKingMove(move, piece);
                break;
        }
    }

    private boolean validatePawnMove(Move move, Piece piece) {
        int direction = piece.getColor() == Color.WHITE ? 1 : -1;
        if (move.getEndX() == move.getStartX() && move.getEndY() == move.getStartY() + direction) {
            return true;
        }
        return false;
    }

    private boolean validateKnightMove(Move move, Piece piece) {
        int dx = Math.abs(move.getEndX() - move.getStartX());
        int dy = Math.abs(move.getEndY() - move.getStartY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    private boolean validateBishopMove(Move move, Piece piece) {
        return Math.abs(move.getEndX() - move.getStartX()) == Math.abs(move.getEndY() - move.getStartY());
    }

    private boolean validateRookMove(Move move, Piece piece) {
        return move.getEndX() == move.getStartX() || move.getEndY() == move.getStartY();
    }

    private boolean validateQueenMove(Move move, Piece piece) {
        return validateBishopMove(move, piece) || validateRookMove(move, piece);
    }

    private boolean validateKingMove(Move move, Piece piece) {
        int dx = Math.abs(move.getEndX() - move.getStartX());
        int dy = Math.abs(move.getEndY() - move.getStartY());
        return dx <= 1 && dy <= 1;
    }

    public void customizeRules() {
        // Logic to customize rules
    }

    public void randomizeRules() {
        // Logic to randomize rules
    }
}
