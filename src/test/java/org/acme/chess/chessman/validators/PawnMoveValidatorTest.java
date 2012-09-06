package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.PawnMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the PawnMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class PawnMoveValidatorTest {

    private PawnMoveValidator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new PawnMoveValidator();
    }

    @Test
    public void testValidateIfMove1ForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove2ForwardShouldReturnValidIfFirstMove() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.validIfFirstMove;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove1Forward1LeftShouldReturnValidIfKill() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(4).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.validIfKill;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove1Forward1RightShouldReturnValidIfKill() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.validIfKill;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // invalid
    @Test
    public void testValidateIfMove1BackShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove3ForwardShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(8).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove1Forward2LeftShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidateIfMove1Forward2RightShouldReturnInvalid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

}
