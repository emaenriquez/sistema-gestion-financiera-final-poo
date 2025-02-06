package Service;

import Entidad.Cliente;
import java.util.List;

public class ClienteService {

    public static Cliente obtenerCliente(List<Cliente> clientes, int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public static boolean clienteExiste(List<Cliente> clientes, Cliente clienteAbuscar) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == clienteAbuscar.getIdCliente()) {
                return true;
            }
        }
        return false;
    }

    public static void registrarCliente(List<Cliente> clientes, String nombre, String direccion, int telefono, String correo) {
        Cliente nuevoCliente = new Cliente(nombre, direccion, telefono, correo);

        if (clienteExiste(clientes, nuevoCliente)) {
            System.out.println("El cliente ya existe en la lista. No se puede registrar nuevamente.");
        } else {
            clientes.add(nuevoCliente); // Registrar el nuevo cliente
            System.out.println("Cliente registrado exitosamente: " + nuevoCliente);
        }
    }
}