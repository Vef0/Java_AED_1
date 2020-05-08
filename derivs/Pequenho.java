package derivs;

import abstracts.Contribuyente;

public class Pequenho extends Contribuyente {

    public Pequenho(String identificacion, double ingresos, double egresos) {
        super(identificacion, ingresos, egresos);
    }
    private double obtenerPago(){
        if (this.getIngresos()<=5000.00){
            return 20.00;
        }else if (this.getIngresos()>5000.00){
            return 60.00;
        }else {
            return 0.00;
        }
    }
    @Override
    public double montoPago() {
        return this.obtenerPago();
    }

    @Override
    public String toString() {
        return "Pequenho "+super.toString()+", Impuesto:"+this.montoPago()+" }";
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
