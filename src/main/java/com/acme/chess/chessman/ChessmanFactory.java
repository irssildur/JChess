package com.acme.chess.chessman;

import com.acme.chess.chessman.restricted.ChessmanColor;
import com.acme.chess.chessman.restricted.ChessmanType;

/**
 * Factory for the {@link Chessman}.
 * @author Istvan_Hever
 *
 */
public class ChessmanFactory {

    /**
     * Creates a {@link Chessman} with type and color.
     * @return {@link Chessman}
     */
    public Chessman createChessman(ChessmanType type, ChessmanColor color) {
        return new Chessman(type, color);
    }

}
