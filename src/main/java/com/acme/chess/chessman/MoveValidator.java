package com.acme.chess.chessman;

import com.acme.chess.move.InvalidMoveException;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * An interface for the Chessman's Move.
 * @author Istvan_Hever
 *
 */
public interface MoveValidator {
    MoveResult validate(Move move) throws InvalidMoveException;
}
