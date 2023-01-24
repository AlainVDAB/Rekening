package be.vdab.util;

public class RekeningnummerException extends RuntimeException {
    public RekeningnummerException() {
    }
    public RekeningnummerException(String omschrijving) {
        super(omschrijving);
    }
}
