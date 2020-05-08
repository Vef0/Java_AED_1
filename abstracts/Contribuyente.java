package abstracts;

import Errores.NotPositiveNumberException;

public abstract class Contribuyente implements Comparable<Contribuyente>{
    private String identificacion;
    private double ingresos;
    private double egresos;

    public Contribuyente(String identificacion, double ingresos, double egresos) {
        setIdentificacion(identificacion);
        setIngresos(ingresos);
        setEgresos(egresos);
    }

    public abstract double montoPago();

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        if (ingresos>=0){
            this.ingresos = ingresos;
        }else{
            try {
                throw new NotPositiveNumberException("Numero no positivo");
            } catch (NotPositiveNumberException e) {
                e.printStackTrace();
            }
        }
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        if (egresos>=0){
            this.egresos = egresos;
        }else{
            try {
                throw new NotPositiveNumberException("Numero no positivo");
            } catch (NotPositiveNumberException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "Contribuyente{ID: "+this.getIdentificacion() +", Ingresos:"+this.getIngresos()+", Egresos: "+this.getEgresos();

    }
    @Override
    public int compareTo(Contribuyente contribuyente) {
        if(this.montoPago() ==contribuyente.montoPago()){
            return 0;
        }else{
            return this.montoPago() > contribuyente.montoPago() ? 1 : -1;
        }
    }
}
