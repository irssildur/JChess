package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.KnightMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the KnightMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class KnightMoveValidatorTest {

    private KnightMoveValidator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new KnightMoveValidator();
    }

    // ForwardLeft
    @Test
    public void testValidate1Left2ForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(4).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidate2Left1ForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // BackLeft

    @Test
    public void testValidate1Left2BackShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(4).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidate2Left1BackShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // BackRight

    @Test
    public void testValidate1Right2BackShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidate2Right1BackShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // BackRight

    @Test
    public void testValidate1Right2ForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(7).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidate2Right1ForwardShouldReturnValid() {
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();

        EasyMock.expect(move.getToX()).andReturn(7).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    // Invalid

    @Test
    public void testValidate1MoveForwardShouldReturnInvalid() {
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
    public void testValidateNotMovingShouldReturnInvalid() {
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
