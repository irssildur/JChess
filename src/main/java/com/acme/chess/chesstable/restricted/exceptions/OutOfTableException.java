package com.acme.chess.chesstable.restricted.exceptions;

/**
 * Exception which shows that the Move is out of the Table.
 * @author Istvan_Hever
 *
 */
public class OutOfTableException extends Exception {

    public OutOfTableException() {
        // TODO Auto-generated constructor stub
    }

    public OutOfTableException(String message) {
        super(message);
    }

    public OutOfTableException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public OutOfTableException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

}
