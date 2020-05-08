package Errores;

public class NotPositiveNumberException extends Exception {
    /**
     * Esto sugiere el VSCode pero no se porque 
     */
    private static final long serialVersionUID = 1L;

    public NotPositiveNumberException(String mensaje) {
        super(mensaje);
    }
}