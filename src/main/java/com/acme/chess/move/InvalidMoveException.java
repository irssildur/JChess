package com.acme.chess.move;

/**
 * Defines an exception that is thrown when a move is invalid for the chessman.
 * @author Istvan_Hever
 *
 */
public class InvalidMoveException extends Exception {

    public InvalidMoveException() {
        // TODO Auto-generated constructor stub
    }

    public InvalidMoveException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public InvalidMoveException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public InvalidMoveException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

}
