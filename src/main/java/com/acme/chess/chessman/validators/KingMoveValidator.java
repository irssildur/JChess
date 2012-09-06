package com.acme.chess.chessman.validators;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validator for the King's move.
 * @author Istvan_Hever
 *
 */
public class KingMoveValidator implements MoveValidator {

    public MoveResult validate(Move move) {

        MoveResult result = MoveResult.invalid;

        if (getMoveDelta(move, 'x') == 1 || getMoveDelta(move, 'y') == 1) {
            result = MoveResult.valid;
        }

        return result;
    }

    private int getMoveDelta(Move move, Character xy) {

        Integer delta = 0;

        if (xy == 'x') {
            delta = Math.abs(move.getFromX() - move.getToX());
        } else if (xy == 'y') {
            delta = Math.abs(move.getFromY() - move.getToY());
        }
        return delta;
    }
}
