package com.acme.chess.chessman.validators;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validator for the Knight class.
 * @author Istvan_Hever
 *
 */
public class KnightMoveValidator implements MoveValidator {

    public MoveResult validate(Move move) {
        MoveResult result = MoveResult.invalid;

        if (Math.abs(move.getFromX() - move.getToX()) == 1 && Math.abs(move.getFromY() - move.getToY()) == 2) {
            result = MoveResult.valid;
        } else if (Math.abs(move.getFromX() - move.getToX()) == 2 && Math.abs(move.getFromY() - move.getToY()) == 1) {
            result = MoveResult.valid;
        }

        return result;
    }

}
