
package PPI;

import java.util.Scanner;


public class Cliente extends Persona {
    // clase cliente
    
    private String nombre;
    private String documento;
    Scanner leer = new Scanner(System.in);

    public void Inf_cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String Info_cliente() {
        return "  -Tu registro fue exitoso "
                + " -nombre :" + this.nombre
                + "  -documento: " + this.documento;
    }

    public void Buscar_productos() {

        System.out.println("Ingresa el nombre del producto");
        String name = leer.nextLine();

        String[][] productos_disponibles = new String[4][2];

        productos_disponibles[0][0] = "Reloj Hublot";
        productos_disponibles[0][1] = "80.000";

        productos_disponibles[1][0] = "Gafas Versace";
        productos_disponibles[1][1] = "45.000";

        productos_disponibles[2][0] = "Reloj Rolex";
        productos_disponibles[2][1] = "100.000";

        productos_disponibles[3][0] = "Reloj Smartwhact";
        productos_disponibles[3][1] = "140.000";

        if (name.equalsIgnoreCase(productos_disponibles[0][0]) == true) {

            System.out.println(" El producto disponible es:  "
                    + productos_disponibles[0][0]
                    + " precio:" + productos_disponibles[0][1]);
        } else if (name.equalsIgnoreCase(productos_disponibles[1][0]) == true) {
            System.out.println(" El producto disponible es:  "
                    + productos_disponibles[1][0]
                    + " precio:" + productos_disponibles[1][1]);

        } else if (name.equalsIgnoreCase(productos_disponibles[2][0]) == true) {
            System.out.println(" El producto disponible es:  "
                    + productos_disponibles[2][0]
                    + " precio:" + productos_disponibles[2][1]);
        } else if (name.equalsIgnoreCase(productos_disponibles[3][0]) == true) {
            System.out.println(" El producto disponible es:  "
                    + productos_disponibles[3][0]
                    + " precio:" + productos_disponibles[3][1]);
        } else {
            System.out.println("El producto no esta disponible");
        }
    }
}


