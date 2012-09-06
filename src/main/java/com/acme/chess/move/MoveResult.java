package com.acme.chess.move;


/**
 * What is the result of a Move.
 * Like valid, invalid, kill, check, or checkmate
 * @author Istvan_Hever
 *
 */
public enum MoveResult {
    valid, validIfKill, validIfFirstMove, invalid
}
