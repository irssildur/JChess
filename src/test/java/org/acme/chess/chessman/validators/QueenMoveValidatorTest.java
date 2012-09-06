package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.QueenMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the BishopMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class QueenMoveValidatorTest {

    private QueenMoveValidator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new QueenMoveValidator();
    }

    @Test
    public void testIfMovesForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesBackwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesLeftShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(5).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesRightShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(5).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // Like a bishop
    @Test
    public void testIfMovesForwardLeftShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesForwardRightShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesBackwardLeftShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesBackwardRightShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    //invalid

    @Test
    public void testIfNotMovesShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(5).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfMovesLikeAHorseShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

}
