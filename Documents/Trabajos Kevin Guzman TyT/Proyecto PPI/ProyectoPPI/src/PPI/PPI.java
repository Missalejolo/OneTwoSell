
package PPI;

import java.util.Scanner;

public class PPI {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String user_type = "";

        String nombre;
        String documento;
        String producto_servicio;
        String direccion;
        
        System.out.println("Bievenido, Que tipo de usuario desea"
                + " registrar ? cliente o vendedor ");
        user_type = leer.next();

        if (user_type.equalsIgnoreCase("cliente") == true) {
            System.out.println(" Ingrese su nombre ");
            nombre = leer.nextLine();

            System.out.println(" Ingrese su documento");
            documento = leer.nextLine();

            Cliente cliente = new Cliente();
            cliente.Inf_cliente(nombre, documento);

            System.out.println(cliente.Info_cliente());

            cliente.Buscar_productos();

        } else if (user_type.equalsIgnoreCase("vendedor") == true) {

            System.out.println(" Ingrese su nombre ");
            nombre = leer.next();

            System.out.println(" Ingrese su documento");
            documento = leer.next();

            System.out.println(" Ingrese el nombre del producto o servicio a ofrecer ");
            producto_servicio = leer.next();

            System.out.println(" Ingrese la dirección del local");
            direccion = leer.next();

            Persona vendedor = new Persona();
            vendedor.Inf_persona(nombre, documento, producto_servicio, direccion);

            System.out.println(vendedor.Info_vendedor());
            

            System.out.println(" Ingresa la cantidad articulos "
                    + " a guardar en su perfil");
            int n = leer.nextInt();

            vendedor.Ingresar_Productos(n);

        } else {
            System.out.println(" Tipo de usuario incorrecto");
        }

    }

}
