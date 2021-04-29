
package PPI;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);

    private String nombre;
    private String documento;
    private String nombre_negocio;
    private String direccion_Negocio;
    String[][] los_vendedores = new String[0][2];

    public void Inf_persona(String nombre, String documento, String nombre_l, String direccion) {

        this.nombre = nombre;
        this.documento = documento;
        this.nombre_negocio = nombre_l;
        this.direccion_Negocio = direccion;
    }

    public String Info_vendedor() {
        return " Tu registro fue exitoso "
                + " -nombre: " + this.nombre
                + "  -documento: " + this.documento
                + "  -dirección: " + this.direccion_Negocio
                + "  -nombre libreria: " + this.nombre_negocio;
    }

    public void Ingresar_Productos(int n) {

        los_vendedores = new String[n][2];

        for (int i = 0; i < los_vendedores.length; i++) {

            System.out.println("Ingresa el nombre del producto " + (i + 1));
            los_vendedores[i][0] = leer.nextLine();

            System.out.println("Ingresa el precio del producto " + (i + 1));
            los_vendedores[i][1] = leer.nextLine();
        }

        for (int j = 0; j < los_vendedores.length; j++) {

            System.out.println("Productos disponibles : "
                    + " Nombre : " + los_vendedores[j][0]
                    + " Precio : " + los_vendedores[j][1]);

        }

    }
}

