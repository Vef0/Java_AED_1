package Errores;

public class NotPositiveNumberException extends Exception {
    public NotPositiveNumberException(String mensaje){
        super(mensaje);
    }
}