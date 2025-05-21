package Models;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private List<Cliente> listaClientes;
    
    public Clientes() {
        listaClientes = new ArrayList<>();
        // Datos de ejemplo
        agregarCliente(1, "Juan Pérez", "555-1234567");
        agregarCliente(2, "María García", "555-7654321");
    }
    
    public static class Cliente {
        private int id;
        private String nombre;
        private String telefono;
        
        public Cliente() {
            
        }
        
        public Cliente(int id, String nombre, String telefono) {
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
        }
        
        // Getters
        public int getId() { return id; }
        public String getNombre() { return nombre; }
        public String getTelefono() { return telefono; }
        
        //Setters
        public void setId(int id) {
        this.id = id;
        }

        public void setNombre(String nombre) {
        this.nombre = nombre;
        }

        public void setTelefono(String telefono) {
        this.telefono = telefono;
        }
    }
    
    
    /**
     * Agrega un nuevo cliente con validaciones
     * @return true si se agregó correctamente
     */
    public boolean agregarCliente(int id, String nombre, String telefono) {
        // Validaciones
        if(nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre es requerido");
            return false;
        }else if(telefono == null || telefono.trim().isEmpty()) {
            System.out.println("Error: El teléfono es requerido");
            return false;
        }else if(id <= 0) {
            System.out.println("Error: ID debe ser positivo");
            return false;
        }
        
        // Verificar ID único
        for(Cliente c : listaClientes) {
            if(c.getId() == id) {
                System.out.println("Error: Ya existe un cliente con este ID");
                return false;
            }
        }
        listaClientes.add(new Cliente(id, nombre, telefono));
        System.out.println("Cliente agregado correctamente! ID: " + id);
        return true;
    }
    
    /**
     * Elimina un cliente por ID
     * @return true si se eliminó correctamente
     */
    public boolean eliminarCliente(int id) {
        int tamañoInicial = listaClientes.size();
        listaClientes.removeIf(cliente -> cliente.getId() == id);
        
        if(listaClientes.size() < tamañoInicial) {
            System.out.println("Cliente eliminado correctamente! ID: " + id);
            return true;
        }
        System.out.println("Error: No se encontró cliente con ID " + id);
        return false;
    }
    
    /**
     * Actualiza un cliente existente
     */
    public boolean actualizarCliente(int id, String nuevoNombre, String nuevoTelefono) {
        for(Cliente c : listaClientes) {
            if(c.getId() == id) {
                if(nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
                    c.nombre = nuevoNombre;
                }
                if(nuevoTelefono != null && !nuevoTelefono.trim().isEmpty()) {
                    c.telefono = nuevoTelefono;
                }
                System.out.println("Cliente actualizado correctamente! ID: " + id);
                return true;
            }
        }
        System.out.println("Error: No se encontró cliente con ID " + id);
        return false;
    }
    
    public List<Cliente> obtenerTodos() {
        return new ArrayList<>(listaClientes);
    }
    
    public Cliente buscarPorId(int id) {
        for(Cliente c : listaClientes) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}