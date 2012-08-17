package com.acme.chess.chessman;

import com.acme.chess.move.Move;

/**
 * An interface for the Chessman's Move.
 * @author Istvan_Hever
 *
 */
public interface MoveValidator {
    Boolean validate(Move move);
}
