package com.acme.chess.chessman.validators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validates a Rook Move.
 * @author Istvan_Hever
 *
 */
public class RookMoveValidator implements MoveValidator {

    private static Logger logger = LoggerFactory.getLogger(RookMoveValidator.class);

    /**
     * Validates the move of a Rook.
     * @param move The Move Object.
     * @return MoveResult
     */
    public MoveResult validate(Move move) {

        MoveResult result = MoveResult.invalid;

        // x == x && y != y
        if (move.getFromX() == move.getToX() && move.getFromY() != move.getToY()) {
            result = MoveResult.valid;
        }
        // x != x && y == y
        if (move.getFromX() != move.getToX() && move.getFromY() == move.getToY()) {
            result = MoveResult.valid;
        }
        // x != x && y != y
        //        if (move.getFromX() != move.getToX() && move.getFromY() != move.getToY()) {
        //
        //            try {
        //                if (getMoveDelta(move, 'x') == getMoveDelta(move, 'y')) {
        //                    result = MoveResult.valid;
        //                }
        //            } catch (IllegalArgumentException e) {
        //                logger.error(e.getMessage());
        //            }
        //        }

        return result;
    }

    /**
     * Calculates of the delta of the move.
     * @param move The Move Object.
     * @param xy Indicates if it should return the x, or the y value. Should be 'x', or 'y' character.
     * @return Returns an int.
     * @throws IllegalArgumentException Exception thown if second parameter doesn't ok.
     */

}
