package com.acme.chess.chessman.validators;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validator for the Queen class.
 * @author Istvan_Hever
 *
 */
public class QueenMoveValidator implements MoveValidator {

    public MoveResult validate(Move move) {

        MoveResult result = MoveResult.invalid;

        // like a rook
        if (move.getFromX() == move.getToX() && move.getFromY() != move.getToY()) {
            result = MoveResult.valid;
        }
        // x != x && y == y
        if (move.getFromX() != move.getToX() && move.getFromY() == move.getToY()) {
            result = MoveResult.valid;
        }

        // like a bishop

        if (Math.abs(move.getFromX() - move.getToX()) == Math.abs(move.getFromY() - move.getToY()) && moved(move)) {

            result = MoveResult.valid;
        }

        return result;
    }

    private boolean moved(Move move) {
        Boolean result = false;
        if (move.getFromX() != move.getToX() || move.getFromY() != move.getToY()) {
            result = true;
        }
        return result;
    }
}
