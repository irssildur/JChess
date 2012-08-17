package com.acme.chess.chessman;

import com.acme.chess.chessman.restricted.ChessmanColor;
import com.acme.chess.chessman.restricted.ChessmanType;
import com.acme.chess.move.Move;

/**
 * Simple implementation of the Chessman interface.
 * @author Istvan_Hever
 *
 */
public class Chessman {

    private ChessmanType type;
    private ChessmanColor color;
    private MoveValidator validator;

    public Chessman(ChessmanType type, ChessmanColor color) {
        this.type = type;
        this.color = color;
    }

    public Boolean validate(Move move) {
        return validator.validate(move);
    }

    public ChessmanColor getChessmanColor() {
        return color;
    }

    public ChessmanType getType() {
        return type;
    }

}
