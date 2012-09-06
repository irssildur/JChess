package com.acme.chess.chessman.validators;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validator for the Pawn class.
 * @author Istvan_Hever
 *
 */
public class PawnMoveValidator implements MoveValidator {

    public MoveResult validate(Move move) {

        MoveResult result = MoveResult.invalid;

        if (((move.getToY() - move.getFromY()) == 1) && move.getFromX() == move.getToX()) {
            result = MoveResult.valid;
        } else if (((move.getToY() - move.getFromY()) == 2) && move.getFromX() == move.getToX()) {
            result = MoveResult.validIfFirstMove;
        } else if (((move.getToY() - move.getFromY()) == 1) && move.getFromX() - move.getToX() == 1) {
            result = MoveResult.validIfKill;
        } else if (((move.getToY() - move.getFromY()) == 1) && move.getFromX() - move.getToX() == -1) {
            result = MoveResult.validIfKill;
        }

        return result;
    }

}
