package Errores;

public class NotPositiveNumberException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NotPositiveNumberException(String mensaje) {
        super(mensaje);
    }
}