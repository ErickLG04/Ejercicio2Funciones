import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
         double iva = 21;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el Precio");
        double precioConIva = PrecioIva( scanner.nextDouble(),iva);
        System.out.println("Precio Con Iva " + precioConIva);

    }
    static double PrecioIva (double precio , double iva){
        double precioConIva = precio * (1+ iva/100);
        return precioConIva;
    }
}
