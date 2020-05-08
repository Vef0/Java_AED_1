import Generics.Bolsa;
import abstracts.Contribuyente;


public class Principal {
    public static void main(String[] args) {
        Bolsa<Contribuyente> bol_contri = new Bolsa<>(2);
        bol_contri.insertar(new derivs.Principal("Alvaro", 832.3, 456.2, 159.1));
        bol_contri.insertar(new derivs.Pequenho("Alvaro", 853.3, 851.2));

        Object[] extr = bol_contri.extremos();
        System.out.println("Objeto de la lista extremo menor: \n"+extr[0]+"\nExtremo mayor: \n"+extr[1]);
        System.out.println("Imprimiendo lo que tiene la bolsa: ");
        
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println("HOLA");
        System.out.println("HOLA");
        listar(bol_contri);

    }

    public static void listar(Bolsa<Contribuyente> x){
        for (Contribuyente a : x.getItems()){
            System.out.println(a);
        }
    }
}