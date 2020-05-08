package derivs;

import Errores.NotPositiveNumberException;
import abstracts.Contribuyente;

import static java.lang.Math.abs;

public class Principal extends Contribuyente {
    private double utilidad;
    public Principal(String identificacion, double ingresos, double egresos, double utilidad) {
        super(identificacion, ingresos, egresos);
        setUtilidad(utilidad);
    }

    @Override
    public String toString() {
        return "Principal "+super.toString() +", Utilidad: "+this.getUtilidad()+", Impuesto:"+this.montoPago()+" }";
    }

    @Override
    public double montoPago() {
        return (abs((this.getIngresos()-this.getEgresos()))*1.5)/100;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        if (utilidad>=0){
            this.utilidad = utilidad;
        }else{
            try {
                throw new NotPositiveNumberException("Numero no positivo");
            } catch (NotPositiveNumberException e) {
                e.printStackTrace();
            }
        }
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
