package com.acme.chess.move;

import com.acme.chess.chessman.Chessman;

/**
 * From and to Fields.
 * @author Istvan_Hever
 *
 */
public class Move {

    private Integer fromX;
    private Integer fromY;
    private Integer toX;
    private Integer toY;
    private Chessman chessman;

    public Chessman getChessman() {
        return chessman;
    }

    public void setChessman(Chessman chessman) {
        this.chessman = chessman;
    }

    public Integer getFromX() {
        return fromX;
    }

    public void setFromX(Integer fromX) {
        this.fromX = fromX;
    }

    public Integer getFromY() {
        return fromY;
    }

    public void setFromY(Integer fromY) {
        this.fromY = fromY;
    }

    public Integer getToX() {
        return toX;
    }

    public void setToX(Integer toX) {
        this.toX = toX;
    }

    public Integer getToY() {
        return toY;
    }

    public void setToY(Integer toY) {
        this.toY = toY;
    }

}
