package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.BishopMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the BishopMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class BishopMoveValidatorTest {

    private BishopMoveValidator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new BishopMoveValidator();
    }

    @Test
    public void testIfMovingForwardLeftShouldReturnValid() {
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
    public void testIfMovingBackwardLeftShouldReturnValid() {
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

    @Test
    public void testIfMovingBackwardRightShouldReturnValid() {
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
    public void testIfMovingForwardRightShouldReturnValid() {
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
    public void testIfMovingForwardShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfNotMovingShouldReturnInvalid() {
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

}
