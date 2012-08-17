package com.acme.chess.chesstable.api;

import java.util.List;

import com.acme.chess.chessman.Chessman;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 *  Defines a ChessTable.
 */
public interface ChessTable {

    /** What is the result of a move.
     * @return {@link MoveResult}
     */
    MoveResult getMoveResult();
    /**
     * Does a move on the table.
     * @param move the Move.
     * @return returns a MoveResult Enum
     */
    MoveResult doMove(Move move);
    /**
     * Playable chessmans.
     * @return list of {@link Chessman}
     */
    List<Chessman> getLiveChessmans();
    /**
     * Dead chessmans.
     * @return list of {@link Chessman}
     */
    List<Chessman> getDeadChessmans();
}
