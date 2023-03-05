public class Ejercicio2 {

    public static void main(String[] args) {
         double iva = 21;

        double precioConIva = PrecioIva(50, iva );
        System.out.println(precioConIva);

    }
    static double PrecioIva (double precio , double iva){
        double precioConIva = precio * (1+ iva/100);
        return precioConIva;
    }
}
