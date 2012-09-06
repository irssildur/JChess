package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.KingMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the KingMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class KingMoveValidatorTest {

    private KingMoveValidator underTest;

    @Before
    public void setUp() {
        underTest = new KingMoveValidator();
    }

    @Test
    public void testIfFromXAndFromYXEqualsAndToXAndToYEqualsShouldReturnInvalid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(0).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(0).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfFromXAndFromYXEqualsAndToXAndToYNotEqualsAndDeltaIsBiggerThanOneShouldReturnInvalid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(0).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(2).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(2).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    //Valid Moves
    @Test
    public void testIfStepOneForwardShouldReturnValid() {
        // Given
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
    public void testIfStepOneForwardAndRightShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(6).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneRightShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(5).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneBackAndRightShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneBackShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneBackAndLeftShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(4).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneLeftShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(4).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(5).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfStepOneForwardAndLeftShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(5).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(5).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(6).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(4).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

}
