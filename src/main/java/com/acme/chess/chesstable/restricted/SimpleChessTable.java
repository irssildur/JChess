package com.acme.chess.chesstable.restricted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acme.chess.chessman.Chessman;
import com.acme.chess.chessman.ChessmanFactory;
import com.acme.chess.chessman.restricted.ChessmanColor;
import com.acme.chess.chessman.restricted.ChessmanType;
import com.acme.chess.chesstable.api.ChessTable;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Simple implementation of the ChessTable interface.
 */
public class SimpleChessTable implements ChessTable {

    private static final int TABLE_SIZE = 8;
    private static Logger logger = LoggerFactory.getLogger(SimpleChessTable.class);
    private Chessman[][] table = (Chessman[][]) Array.newInstance(Chessman.class, TABLE_SIZE, TABLE_SIZE);
    private ChessmanFactory factory;

    /**
     * Constructor.
     * @param chessmanFactory factory for the Chessman
     */
    public SimpleChessTable(ChessmanFactory chessmanFactory) {
        this.factory = chessmanFactory;
    }

    /**
     * Reseting and filling up the table with Chessman.
     */
    public void fillTableWithChessman() {
        logger.info(" *** Filling table with chessman has started *** ");
        resetTable();
        fillSidesWithChessman(ChessmanColor.ligth);
        fillSidesWithChessman(ChessmanColor.dark);
        logger.info(" *** Filling table with chessman has finished *** ");
    }

    public MoveResult doMove(Move move) {
        checkIfDestionationIsFree(move);
        move.getChessman().validate(move);
        // TODO finish this
        return null;
    }

    private Boolean checkIfDestionationIsFree(Move move) {
        Boolean isFree = true;
        if (table[move.getToX()][move.getToY()] != null) {
            isFree = false;
        }
        return isFree;
    }

    public MoveResult getMoveResult() {

        return null;

    }

    public List<Chessman> getDeadChessmans() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Chessman> getLiveChessmans() {
        List<Chessman> liveChessman = new ArrayList<Chessman>();
        for (Integer row = 0; row < TABLE_SIZE; row++) {
            for (Integer column = 0; column < TABLE_SIZE; column++) {
                if (table[row][column] != null) {
                    logger.debug("Live Chessman Found: " + table[row][column].toString());
                    liveChessman.add(table[row][column]);
                }
            }
        }
        return liveChessman;
    }

    private void fillSidesWithChessman(ChessmanColor color) {
        logger.debug(String.format("Filling Sides With %s Chessman has started", color.name()));
        Integer rowBase = 0;
        Integer rowNext = 1;
        Integer kingIndex = 3;
        Integer queenIndex = 4;

        if (color == ChessmanColor.dark) {
            rowBase = 7;
            rowNext = 6;
            kingIndex = 4;
            queenIndex = 3;
        }
        table[rowBase][0] = factory.createChessman(ChessmanType.rook, color);
        table[rowBase][1] = factory.createChessman(ChessmanType.knight, color);
        table[rowBase][2] = factory.createChessman(ChessmanType.bishop, color);
        table[rowBase][kingIndex] = factory.createChessman(ChessmanType.king, color);
        table[rowBase][queenIndex] = factory.createChessman(ChessmanType.queen, color);
        table[rowBase][5] = factory.createChessman(ChessmanType.bishop, color);
        table[rowBase][6] = factory.createChessman(ChessmanType.knight, color);
        table[rowBase][7] = factory.createChessman(ChessmanType.rook, color);
        for (Integer index = 0; index < TABLE_SIZE; index++) {
            table[rowNext][index] = factory.createChessman(ChessmanType.pawn, color);

        }
        logger.debug(String.format("Filling Sides With %s Chessman has finished", color.name()));
    }

    private void resetTable() {
        logger.debug("Reseting table");
        for (Integer row = 0; row < TABLE_SIZE; row++) {
            for (Integer column = 0; column < TABLE_SIZE; column++) {
                table[row][column] = null;
            }
        }
    }

    public Chessman[][] getTable() {
        return table;
    }

    public void setTable(Chessman[][] table) {
        this.table = table;
    }
}
