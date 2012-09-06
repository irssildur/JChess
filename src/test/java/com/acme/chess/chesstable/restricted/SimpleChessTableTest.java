package com.acme.chess.chesstable.restricted;

import java.lang.reflect.Array;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.Chessman;
import com.acme.chess.chessman.ChessmanFactory;
import com.acme.chess.chessman.restricted.ChessmanColor;
import com.acme.chess.chessman.restricted.ChessmanType;

/**
 * Test class for the SimpleChessTable class.
 * @author Istvan_Hever
 *
 */
public class SimpleChessTableTest {

    private static final int TABLE_SIZE = 8;
    private ChessmanFactory chessmanFactoryMock = EasyMock.createMock(ChessmanFactory.class);
    private SimpleChessTable underTest;
    private Chessman chessman;

    private Chessman chessmanMockRookLight;
    private Chessman chessmanMockKnightLight;
    private Chessman chessmanMockBishopLight;
    private Chessman chessmanMockKingLight;
    private Chessman chessmanMockQueenLight;
    private Chessman chessmanMockPawnLight;
    private Chessman chessmanMockRookDark;
    private Chessman chessmanMockKnightDark;
    private Chessman chessmanMockBishopDark;
    private Chessman chessmanMockKingDark;
    private Chessman chessmanMockQueenDark;
    private Chessman chessmanMockPawnDark;

    @Before
    public void setUp() throws Exception {
        //chessmanFactoryMock = EasyMock.createMock(ChessmanFactory.class);

        chessmanMockRookLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.rook, ChessmanColor.ligth).createMock();
        chessmanMockKnightLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.knight, ChessmanColor.ligth).createMock();
        chessmanMockBishopLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.bishop, ChessmanColor.ligth).createMock();
        chessmanMockKingLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.king, ChessmanColor.ligth).createMock();
        chessmanMockQueenLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.queen, ChessmanColor.ligth).createMock();
        chessmanMockPawnLight = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.pawn, ChessmanColor.ligth).createMock();

        chessmanMockRookDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.rook, ChessmanColor.dark).createMock();
        chessmanMockKnightDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.knight, ChessmanColor.dark).createMock();
        chessmanMockBishopDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.bishop, ChessmanColor.dark).createMock();
        chessmanMockKingDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.king, ChessmanColor.dark).createMock();
        chessmanMockQueenDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.queen, ChessmanColor.dark).createMock();
        chessmanMockPawnDark = EasyMock.createMockBuilder(Chessman.class).withConstructor(ChessmanType.pawn, ChessmanColor.dark).createMock();

        underTest = new SimpleChessTable(chessmanFactoryMock);

    }

    @Test
    public void testfFillTableWithChessman() {

        // GIVEN
        Chessman[][] table = (Chessman[][]) Array.newInstance(Chessman.class, TABLE_SIZE, TABLE_SIZE);

        table[0][0] = chessmanMockRookLight;
        table[0][1] = chessmanMockKnightLight;
        table[0][2] = chessmanMockBishopLight;
        table[0][3] = chessmanMockKingLight;
        table[0][4] = chessmanMockQueenLight;
        table[0][5] = chessmanMockBishopLight;
        table[0][6] = chessmanMockKnightLight;
        table[0][7] = chessmanMockRookLight;
        table[1][0] = chessmanMockPawnLight;
        table[1][1] = chessmanMockPawnLight;
        table[1][2] = chessmanMockPawnLight;
        table[1][3] = chessmanMockPawnLight;
        table[1][4] = chessmanMockPawnLight;
        table[1][5] = chessmanMockPawnLight;
        table[1][6] = chessmanMockPawnLight;
        table[1][7] = chessmanMockPawnLight;
        table[6][0] = chessmanMockPawnDark;
        table[6][1] = chessmanMockPawnDark;
        table[6][2] = chessmanMockPawnDark;
        table[6][3] = chessmanMockPawnDark;
        table[6][4] = chessmanMockPawnDark;
        table[6][5] = chessmanMockPawnDark;
        table[6][6] = chessmanMockPawnDark;
        table[6][7] = chessmanMockPawnDark;
        table[7][0] = chessmanMockRookDark;
        table[7][1] = chessmanMockKnightDark;
        table[7][2] = chessmanMockBishopDark;
        table[7][3] = chessmanMockQueenDark;
        table[7][4] = chessmanMockKingDark;
        table[7][5] = chessmanMockBishopDark;
        table[7][6] = chessmanMockKnightDark;
        table[7][7] = chessmanMockRookDark;

        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.rook, ChessmanColor.ligth)).andReturn(chessmanMockRookLight).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.knight, ChessmanColor.ligth)).andReturn(chessmanMockKnightLight).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.bishop, ChessmanColor.ligth)).andReturn(chessmanMockBishopLight).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.king, ChessmanColor.ligth)).andReturn(chessmanMockKingLight).times(1);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.queen, ChessmanColor.ligth)).andReturn(chessmanMockQueenLight).times(1);

        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.pawn, ChessmanColor.ligth)).andReturn(chessmanMockPawnLight).times(8);

        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.rook, ChessmanColor.dark)).andReturn(chessmanMockRookDark).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.knight, ChessmanColor.dark)).andReturn(chessmanMockKnightDark).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.bishop, ChessmanColor.dark)).andReturn(chessmanMockBishopDark).times(2);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.king, ChessmanColor.dark)).andReturn(chessmanMockKingDark).times(1);
        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.queen, ChessmanColor.dark)).andReturn(chessmanMockQueenDark).times(1);

        EasyMock.expect(chessmanFactoryMock.createChessman(ChessmanType.pawn, ChessmanColor.dark)).andReturn(chessmanMockPawnDark).times(8);

        EasyMock.replay(chessmanFactoryMock);
        // WHEN
        //underTest.fillTableWithFields();
        underTest.fillTableWithChessman();
        // THEN
        EasyMock.verify(chessmanFactoryMock);

        Assert.assertArrayEquals(table, underTest.getTable());

    }

    @Test
    public void testGetLiveChessmanIfTableIsEmptyShouldReturnEmptyList() {
        // GIVEN
        Chessman[][] mockTable = (Chessman[][]) Array.newInstance(Chessman.class, TABLE_SIZE, TABLE_SIZE);
        underTest.setTable(mockTable);
        //WHEN
        List<Chessman> underTestResultList = underTest.getLiveChessmans();
        // THEN
        Assert.assertTrue(underTestResultList.isEmpty());

    }

    @Test
    public void testGetLiveChessmanIfTableHasChessmanBoundaryShouldReturn() {
        // GIVEN
        Chessman[][] mockTable = (Chessman[][]) Array.newInstance(Chessman.class, TABLE_SIZE, TABLE_SIZE);

        mockTable[0][0] = chessmanMockBishopDark;
        mockTable[0][7] = chessmanMockRookDark;
        mockTable[1][0] = chessmanMockPawnLight;
        mockTable[1][7] = chessmanMockBishopLight;
        mockTable[6][0] = chessmanMockQueenDark;
        mockTable[6][7] = chessmanMockQueenLight;
        mockTable[7][0] = chessmanMockKingDark;
        mockTable[7][7] = chessmanMockKingLight;

        underTest.setTable(mockTable);
        //WHEN
        List<Chessman> underTestResultList = underTest.getLiveChessmans();
        // THEN
        Assert.assertTrue(underTestResultList.contains(chessmanMockBishopDark));
        Assert.assertTrue(underTestResultList.contains(chessmanMockRookDark));
        Assert.assertTrue(underTestResultList.contains(chessmanMockPawnLight));
        Assert.assertTrue(underTestResultList.contains(chessmanMockBishopLight));
        Assert.assertTrue(underTestResultList.contains(chessmanMockQueenLight));
        Assert.assertTrue(underTestResultList.contains(chessmanMockQueenLight));
        Assert.assertTrue(underTestResultList.contains(chessmanMockKingDark));
        Assert.assertTrue(underTestResultList.contains(chessmanMockKingLight));

    }

}
