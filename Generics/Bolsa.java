package Generics;

import abstracts.Contribuyente;

import java.util.ArrayList;


public class Bolsa <T> {
    private ArrayList<T> items;

    public Bolsa(int nro) {
        this.items = new ArrayList<>(nro);

    }
    public ArrayList<T> getItems() {
        return items;
    }
    public void insertar(T x){
        this.items.add(x);
    }
    public Object[] extremos(){
        Object [] lista;
        Contribuyente min = (Contribuyente)this.items.get(0);
        Contribuyente max = (Contribuyente)this.items.get(0);
        ArrayList<Contribuyente> lis = new ArrayList<>();
        for (T l : this.items){
            lis.add((Contribuyente)l);
        }
        for (Contribuyente a : lis){
            if (a.compareTo(min) < 0){
                min = a;
            }
            if (a.compareTo(max) > 0){
                max = a;
            }
        }
        lista = new Object[] {min,max};
        return lista;
    }

    @Override
    public String toString() {
        return "Bolsa{" +
                "items=" + this.getItems() +
                '}';
    }
}
