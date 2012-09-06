package org.acme.chess.chessman.validators;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.acme.chess.chessman.validators.RookMoveValidator;
import com.acme.chess.move.Move;
import com.acme.chess.move.MoveResult;

/**
 * Test class for the RookMoveValidator class.
 * @author Istvan_Hever
 *
 */
public class RookMoveValidatorTest {

    private RookMoveValidator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new RookMoveValidator();
    }

    @Test
    public void testIfXAndYAndToAndFromAreBothSameShouldReturnInvalid() {
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
    public void testIfXToAndFromAreSameAndYNotShouldReturnInvalid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(1).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(2).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.invalid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfXToAndFromAreSameAndYNotShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(1).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(0).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(3).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIfYToAndFromAreSameAndXNotShouldReturnValid() {
        // Given
        Move move = EasyMock.createMock(Move.class);

        EasyMock.expect(move.getFromX()).andReturn(3).anyTimes();
        EasyMock.expect(move.getFromY()).andReturn(0).anyTimes();
        EasyMock.expect(move.getToX()).andReturn(2).anyTimes();
        EasyMock.expect(move.getToY()).andReturn(0).anyTimes();

        EasyMock.replay(move);

        MoveResult expected = MoveResult.valid;
        // When
        MoveResult actual = underTest.validate(move);
        // Then
        Assert.assertEquals(expected, actual);
    }

}
