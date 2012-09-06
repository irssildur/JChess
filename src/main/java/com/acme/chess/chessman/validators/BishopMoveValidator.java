package com.acme.chess.chessman.validators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.chess.chessman.MoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Validating bishop.
 * @author Istvan_Hever
 *
 */
public class BishopMoveValidator implements MoveValidator {

    private static Logger logger = LoggerFactory.getLogger(BishopMoveValidator.class);

    public MoveResult validate(Move move) {

        MoveResult result = MoveResult.invalid;

        if (Math.abs(move.getFromX() - move.getToX()) == Math.abs(move.getFromY() - move.getToY()) && moved(move)) {
            logger.debug("1. (move.getFromX() - move.getToX()) == (move.getFromY() - move.getToY())");
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
