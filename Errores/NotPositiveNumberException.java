package Errores;

public class NotPositiveNumberException extends Exception {
    /**
     * Va ahora si
     */
    private static final long serialVersionUID = 1L;

    public NotPositiveNumberException(String mensaje) {
        super(mensaje);
    }
}