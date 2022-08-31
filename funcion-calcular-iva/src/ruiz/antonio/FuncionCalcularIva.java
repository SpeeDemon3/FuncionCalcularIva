package ruiz.antonio;

public class FuncionCalcularIva {


    public static void main(String[] args) {
    double precio = 3.33d;
    double precioFinal = calcularIva(precio);
    System.out.println("El precio final con iva es de: " + precioFinal + " euros.");

    }
    static double calcularIva(double precio) {
        return precio * 21 / 100 + precio;
    }





}
