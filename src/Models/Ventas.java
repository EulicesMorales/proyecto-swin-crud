package Models;

import java.util.ArrayList;
import java.util.List;

public class Ventas {
    private List<Venta> listaVentas;
    private int nextId = 1; // Para autoincrementar IDs
    
    public Ventas() {
        listaVentas = new ArrayList<>();
    }
    
    public static class Venta {
        private int id;
        private String fecha;
        private int idCliente;
        private List<String> productos;
        private double total;
        
        public Venta(int id, String fecha, int idCliente, List<String> productos, double total) {
            this.id = id;
            this.fecha = fecha;
            this.idCliente = idCliente;
            this.productos = new ArrayList<>(productos);
            this.total = total;
        }
        
        // Getters
        public int getId() { return id; }
        public String getFecha() { return fecha; }
        public int getIdCliente() { return idCliente; }
        public List<String> getProductos() { return new ArrayList<>(productos); }
        public double getTotal() { return total; }
    }
    
    /**
     * Agrega una nueva venta con validaciones
     * @param fecha Fecha de la venta
     * @param idCliente ID del cliente
     * @param productos Lista de códigos de productos
     * @param total Total de la venta
     * @return ID de la venta creada o -1 si hubo error
     */
    public int agregarVenta(String fecha, int idCliente, List<String> productos, double total) {
        // Validar campos obligatorios
        if(fecha == null || fecha.trim().isEmpty()) {
            System.out.println("Error: La fecha es requerida");
            return -1;
        }
        
        if(idCliente <= 0) {
            System.out.println("Error: ID de cliente inválido");
            return -1;
        }
        
        if(productos == null || productos.isEmpty()) {
            System.out.println("Error: Debe incluir al menos un producto");
            return -1;
        }
        
        if(total <= 0) {
            System.out.println("Error: El total debe ser mayor a cero");
            return -1;
        }
        
        // Generar ID autoincremental
        int id = nextId++;
        
        // Agregar la venta
        listaVentas.add(new Venta(id, fecha, idCliente, productos, total));
        System.out.println("Venta agregada correctamente! ID: " + id);
        return id;
    }
    
    /**
     * Elimina una venta por ID
     * @param id ID de la venta a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarVenta(int id) {
        int tamañoInicial = listaVentas.size();
        listaVentas.removeIf(venta -> venta.getId() == id);
        
        if(listaVentas.size() < tamañoInicial) {
            System.out.println("Venta eliminada correctamente! ID: " + id);
            return true;
        } else {
            System.out.println("Error: No se encontró venta con ID " + id);
            return false;
        }
    }
    
    /**
     * Busca una venta por ID
     * @param id ID de la venta a buscar
     * @return La venta encontrada o null si no existe
     */
    public Venta buscarPorId(int id) {
        for(Venta v : listaVentas) {
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }
    
    /**
     * Obtiene todas las ventas registradas
     * @return Lista de ventas
     */
    public List<Venta> obtenerTodas() {
        return new ArrayList<>(listaVentas);
    }
}