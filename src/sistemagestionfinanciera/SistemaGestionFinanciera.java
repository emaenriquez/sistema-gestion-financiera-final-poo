
package sistemagestionfinanciera;

import Entidad.Cliente;
import Service.ClienteService;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestionFinanciera {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        ClienteService.registrarCliente(clientes, "juan perez", "Calle Falsa 123", 23232232, "ema@gmail.com");        
        ClienteService.registrarCliente(clientes, "Maria Lopez", "Avenida Siempre Viva 456", 12345678, "maria@gmail.com");
        
        int idBuscado = 1;
        Cliente clienteEncontrado = ClienteService.obtenerCliente(clientes, idBuscado);
        if (clienteEncontrado != null) {
            System.out.println("\nCliente encontrado con ID " + idBuscado + ": " + clienteEncontrado);
        } else {
            System.out.println("\nCliente con ID " + idBuscado + " no encontrado.");
        }
    
    }
    
}
